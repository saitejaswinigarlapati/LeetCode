from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        # Split the list into two halves
        slow = head
        fast = head
        prev = None  # to keep track of node before slow

        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        prev.next = None  # break the list into two halves

        # Recursively sort both halves
        l1 = self.sortList(head)
        l2 = self.sortList(slow)

        # Merge the two sorted halves
        return self.merge(l1, l2)

    def merge(self, l1, l2):
        dummy = ListNode(0)
        curr = dummy
        while l1 and l2:
            if l1.val <= l2.val:
                curr.next = l1
                l1 = l1.next
            else:
                curr.next = l2
                l2 = l2.next
            curr = curr.next

        if l1:
            curr.next = l1
        if l2:
            curr.next = l2

        return dummy.next


head=ListNode(4)

second=ListNode(2)
third=ListNode(1)
fourth=ListNode(3)

head.next=second
second.next=third
third.next=fourth

s=Solution()

head=s.sortList(head)

temp=head
while temp is not None:
    print(temp.val,end=" -> ")
    
    temp=temp.next
