
from typing import List,Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        res = ListNode(0, head)
        dummy = res

        for _ in range(n):
            head = head.next
        
        while head:
            head = head.next
            dummy = dummy.next
        
        dummy.next = dummy.next.next

        return res.next
    
def constructLinkedList(ls):
    head=ListNode(ls[0])
    temp=head
    for i in ls[1:]:
        temp.next=ListNode(i)
        temp=temp.next
    return head

def printLinkedList(head):
    temp=head
    while temp:
        print(temp.value,end=' -> ')
        temp=temp.next
    print(None)


head = [1,2,3,4,5]
head=constructLinkedList(head)
n = 2

obj=Solution()
print("Before Removing nth node from end: ")
printLinkedList(head)
obj.removeNthFromEnd(head,n)

print("Afert Removing nth node from end: ")
printLinkedList(head)