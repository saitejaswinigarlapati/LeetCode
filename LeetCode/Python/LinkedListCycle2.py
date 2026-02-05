from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head

        # Detect if there is a cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:  # cycle detected
                break
        else:
            return None  # no cycle

        # Find the start of the cycle
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        
        return slow


# Helper function to create a linked list with a cycle
def listToLL(ls, pos):
    head = ListNode(ls[0])
    curr = head
    nodes = [head]
    for val in ls[1:]:
        curr.next = ListNode(val)
        curr = curr.next
        nodes.append(curr)

    # If pos >= 0, create a cycle
    if pos != -1:
        curr.next = nodes[pos]

    return head


# Example usage
s = Solution()
l = [3, 2, 0, -4]
pos = 1  # position where tail connects (index 1 -> value 2)

head = listToLL(l, pos)
cycle_node = s.detectCycle(head)

if cycle_node:
    print("Cycle detected at node with value:", cycle_node.val)
else:
    print("No cycle detected")
