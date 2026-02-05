from typing import Optional
from collections import deque
class ListNode:
    def __init__(self,val):
        self.val=val
        self.next=None
        
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        stack=deque()
        slow,fast=head,head
        while fast and fast.next:
            stack.append(slow.val)
            slow=slow.next
            fast=fast.next.next
        if fast:
            slow=slow.next
        while slow:
            top=stack.pop()
            if top != slow.val:
                return False
            slow=slow.next
        return True



def print_ll(head):
    temp=head
    while temp:
        print(temp.val,end=' -> ')
        temp=temp.next
    print(None)
def listToLL(ls):
    head=ListNode(ls[0])
    curr=head
    for i in (ls[1:]):
        curr.next=ListNode(i)
        curr=curr.next
    return head

s=Solution()
head=listToLL([1,2,2,1])
print_ll(head)
print(f'Is palindrome: {s.isPalindrome(head)}')


# Input: head = [1,2,2,1]
# Output: true

# Input: head = [1,2]
# Output: false