public class LinkedListCycle2 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect if there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                break;
            }
        }

        // If no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Find start of the cycle
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow; // start node of the cycle
    }

    // Helper function to create a linked list with a cycle
    public static ListNode listToLL(int[] arr, int pos) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        ListNode[] nodes = new ListNode[arr.length];
        nodes[0] = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
            nodes[i] = curr;
        }

        // If pos >= 0, create a cycle
        if (pos != -1) {
            curr.next = nodes[pos];
        }

        return head;
    }

    // Example usage
    public static void main(String[] args) {
        LinkedListCycle2 s = new LinkedListCycle2();
        int[] l = {3, 2, 0, -4};
        int pos = 1; // position where tail connects (index 1 -> value 2)

        ListNode head = listToLL(l, pos);
        ListNode cycleNode = s.detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
