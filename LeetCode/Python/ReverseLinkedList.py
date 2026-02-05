from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        smallLLhead = self.reverseList(head.next)
        temp = smallLLhead
        while temp.next is not None:
            temp = temp.next
        temp.next = head
        head.next = None
        return smallLLhead

def printList(head):
    while head:
        print(head.val, end=" ")
        head = head.next
    print()

# Create linked list: 1 -> 2 -> 3 -> 4 -> 5
head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))

s = Solution()
new_head = s.reverseList(head)
printList(new_head)  # Output: 5 4 3 2 1
