from typing import Optional

class ListNode:
    def __init__(self,val):
        self.val=val
        self.next=None
        
class Solution:
    def removeElements(self, head:Optional [ListNode],val : int) -> Optional[ListNode]:
        dummy=ListNode(0)
        dummy.next=head
        curr=dummy
        while curr.next:
            if curr.next.val==val:
                curr.next=curr.next.next
            else:
                curr=curr.next
        return dummy.next
    
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
head=listToLL([1,2,6,3,4,5,6])
val=6
print_ll(head)
head=s.removeElements(head,val)
print_ll(head)