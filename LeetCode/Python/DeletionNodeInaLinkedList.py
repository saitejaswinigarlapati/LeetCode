class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def deleteNode(self, node):
        if not node or not node.next:
            return
        node.val = node.next.val
        node.next = node.next.next

def printList(head):
    curr = head
    while curr:
        print(curr.val, end=" -> " if curr.next else "")
        curr = curr.next
    print()

head = ListNode(4)
head.next = ListNode(5)
head.next.next = ListNode(1)
head.next.next.next = ListNode(9)

print("Original List:", end=" ")
printList(head)

node_to_delete = head.next

obj = Solution()
obj.deleteNode(node_to_delete)

print("After Deleting 5:", end=" ")
printList(head)

# Input: head = [4,5,1,9], node = 5
# Output: [4,1,9]

# Input: head = [4,5,1,9], node = 1
# Output: [4,5,9]