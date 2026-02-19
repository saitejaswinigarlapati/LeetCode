from typing import Optional

class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random


class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':    
        hash = {None: None}
        cur = head
        
        while cur:
            hash[cur] = Node(cur.val)
            cur = cur.next
            
        cur = head
        
        while cur:
            copy = hash[cur]
            copy.next = hash[cur.next]
            copy.random = hash[cur.random]
            cur = cur.next
            
        return hash[head]


n1 = Node(7)
n2 = Node(13)
n3 = Node(11)
n4 = Node(10)
n5 = Node(1)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5

n1.random = None
n2.random = n1
n3.random = n5
n4.random = n3
n5.random = n1

head = n1

s = Solution()
copy_head = s.copyRandomList(head)

def print_list(head):
    cur = head
    while cur:
        random_val = cur.random.val if cur.random else None
        print(f"[Val: {cur.val}, Random: {random_val}]")
        cur = cur.next

print_list(copy_head)
