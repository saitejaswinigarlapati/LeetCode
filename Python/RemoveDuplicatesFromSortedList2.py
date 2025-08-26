from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)   
        dummy.next = head
        prev = dummy
        current = head

        while current:
            while current.next and current.val == current.next.val:
                current = current.next
            if prev.next == current:
                prev = prev.next
            else:
                prev.next = current.next
            current = current.next
        return dummy.next
            
            
            
def list_to_ll(ls):
    if not ls:
        return None
    head=ListNode(ls[0])
    current=head
    for i in ls[1:]:
        current.next=ListNode(i)
        current=current.next
    return head

def print_ll(head):
    curr=head
    while curr:
        print(curr.val,end=' -> ')
        curr=curr.next
    print('None')
    
s=Solution()
head=[1,2,3,3,4,4,5]
head=list_to_ll(head)
print('Before deletion')
print_ll(head)
head=s.deleteDuplicates(head)
print('After deletion')
print_ll(head)