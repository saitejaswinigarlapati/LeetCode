from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
            
        temp,curr=head,head.next
        curr_head=curr

        while curr and curr.next:
            temp.next=temp.next.next
            temp=temp.next
            curr.next=temp.next
            curr=curr.next
        temp.next=curr_head

        return head
        

    
def listToLL(ls):
    head=ListNode(ls[0])
    curr=head
    for i in (ls[1:]):
        curr.next=ListNode(i)
        curr=curr.next
    return head

def print_ll(head):
    temp=head
    while temp:
        print(temp.val,end=' -> ')
        temp=temp.next
    print(None)

l=[1,2,3,4,5]
head=listToLL(l)

s=Solution()

print("Original list: ")
print_ll(head)
res=s.oddEvenList(head)
print("After conversion:")
print_ll(res)