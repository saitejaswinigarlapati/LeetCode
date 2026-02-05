from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        s=""
        start=head
        while start is not None:
            s+=str(start.val)
            start=start.next
        return int(s,2)


s=Solution()
head=ListNode(1)
head.next=ListNode(0)
head.next.next=ListNode(1)

print("Binary value of the given linked list: ",s.getDecimalValue(head))


