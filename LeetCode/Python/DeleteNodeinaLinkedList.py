# Definition for singly-linked list.
class ListNode:
    def __init__(self, value):
        self.value = value
        self.next = None

class Solution:
    def deleteNode(self, node):
        node.value = node.next.value
        node.next = node.next.next


def constructLinkedList(ls):
    head = ListNode(ls[0])
    temp = head
    nodes = [head]   # to keep references
    for i in ls[1:]:
        temp.next = ListNode(i)
        temp = temp.next
        nodes.append(temp)
    return head, nodes


def printLinkedList(head):
    temp = head
    while temp:
        print(temp.value, end=' -> ')
        temp = temp.next
    print("None")


# Driver Code
head_list = [4,5,1,9]
head, nodes = constructLinkedList(head_list)

# We want to delete node with value 5
node_to_delete = nodes[1]   # This is actual ListNode, not integer

obj = Solution()

print("Before deleting:")
printLinkedList(head)

obj.deleteNode(node_to_delete)

print("After deleting:")
printLinkedList(head)