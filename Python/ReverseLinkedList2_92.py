from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if not head or left == right:
            return head

        dummy = ListNode(0, head)
        prev = dummy

        for _ in range(left - 1):
            prev = prev.next

        curr = prev.next

        for _ in range(right - left):
            temp = curr.next
            curr.next = temp.next
            temp.next = prev.next
            prev.next = temp

        return dummy.next


def print_LL(head):
    temp = head
    while temp:
        print(temp.val, end=' -> ')
        temp = temp.next
    print("None")


def listToLL(ls, pos=-1):
    head = ListNode(ls[0])
    curr = head
    nodes = [head]

    for val in ls[1:]:
        curr.next = ListNode(val)
        curr = curr.next
        nodes.append(curr)

    return head


head = listToLL([1,2,3,4,5])
print_LL(head)

sol = Solution()
head = sol.reverseBetween(head, 4, 5)
print_LL(head)
