class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reorderList(self, head: ListNode) -> None:
        if not head:
            return

        slow, fast = head, head 
        while fast and fast.next: 
            slow = slow.next 
            fast = fast.next.next 

        second = slow.next 
        prev = None
        slow.next = None 
        while second: 
            temp = second.next
            second.next = prev
            prev = second 
            second = temp

        first, second = head, prev
        while second: 
            temp1, temp2 = first.next, second.next
            first.next = second
            second.next = temp1
            first, second = temp1, temp2

def printList(head: ListNode):
    while head:
        print(head.val, end=" -> " if head.next else "")
        head = head.next
    print()

def createLinkedList(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

# Take user input
input_str = input("Enter values separated by space: ")
values = list(map(int, input_str.strip().split()))
head = createLinkedList(values)

# Apply reorder
sol = Solution()
sol.reorderList(head)

# Print result
print("Reordered List:")
printList(head)
