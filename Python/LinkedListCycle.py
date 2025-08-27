from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        temp=head
        dic=set()
        while temp:
            if temp in dic:
                return True
            dic.add(temp)
            temp=temp.next
        return False
    

def buildLinkedList(values, pos=-1):
    if not values:
        return None

    head = ListNode(values[0])
    curr = head
    nodes = [head]

    for val in values[1:]:
        node = ListNode(val)
        curr.next = node
        curr = node
        nodes.append(node)

    if pos != -1:
        curr.next = nodes[pos]

    return head

s=Solution()

head1 = buildLinkedList([3, 2, 0, -4], pos=-1)
print("Has Cycle (Example 1):", s.hasCycle(head1))  # False

head2 = buildLinkedList([3, 2, 0, -4], pos=1)
print("Has Cycle (Example 2):", s.hasCycle(head2))  # True

# Input: head = [3,2,0,-4], pos = 1
# Output: true

# Input: head = [1,2], pos = 0
# Output: true

# Input: head = [1], pos = -1
# Output: false