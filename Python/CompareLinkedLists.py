## Hacker Rank : Compare 2 Linked Lists

def compare_lists(llist1, llist2):
    current1 = llist1
    current2 = llist2

    while current1 is not None and current2 is not None:
        if current1.data != current2.data:
            return 0
        current1 = current1.next
        current2 = current2.next

    # If both lists ended at the same time → equal
    if current1 is None and current2 is None:
        return 1
    else:
        return 0
    
    
    
class SinglyLinkedListNode:
    def __init__(self, data):
        self.data = data
        self.next = None


# Convert Python list to linked list
def list_to_linkedlist(arr):
    if not arr:
        return None

    head = SinglyLinkedListNode(arr[0])
    current = head

    for value in arr[1:]:
        current.next = SinglyLinkedListNode(value)
        current = current.next

    return head


def print_linkedlist(head):
    current = head
    while current:
        print(current.data, end=" -> ")
        current = current.next
    print("None")


list1 = [1, 2]
list2 = [1, 2]

ll1 = list_to_linkedlist(list1)
ll2 = list_to_linkedlist(list2)

print("Linked List 1:")
print_linkedlist(ll1)

print("Linked List 2:")
print_linkedlist(ll2)

result = compare_lists(ll1, ll2)
print("Are equal?", result)