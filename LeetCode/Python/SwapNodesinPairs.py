from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, cur = dummy, head

        while cur and cur.next:
            npn = cur.next.next
            second = cur.next

            second.next = cur
            cur.next = npn
            prev.next = second

            prev = cur
            cur = npn
        
        return dummy.next


def constructLinkedList(ls):
    head = ListNode(ls[0])
    temp = head
    for i in ls[1:]:
        temp.next = ListNode(i)
        temp = temp.next
    return head


def printLinkedList(head):
    temp = head
    while temp:
        print(temp.val, end=" -> ")
        temp = temp.next
    print("None")


s = Solution()

head = [1,2,3,4]
head = constructLinkedList(head)

print("Before swap:")
printLinkedList(head)

head = s.swapPairs(head)

print("After swap:")
printLinkedList(head)