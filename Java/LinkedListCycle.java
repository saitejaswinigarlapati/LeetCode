class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        java.util.HashSet<ListNode> seen = new java.util.HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (seen.contains(temp)) {
                return true;
            }
            seen.add(temp);
            temp = temp.next;
        }
        return false;
    }

    public static ListNode buildLinkedList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        ListNode[] nodes = new ListNode[values.length];
        nodes[0] = head;

        for (int i = 1; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
            curr.next = nodes[i];
            curr = curr.next;
        }

        if (pos != -1) {
            curr.next = nodes[pos];
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();

        ListNode head1 = buildLinkedList(new int[]{3, 2, 0, -4}, -1);
        System.out.println("Has Cycle (Example 1): " + obj.hasCycle(head1)); // false

        ListNode head2 = buildLinkedList(new int[]{3, 2, 0, -4}, 1);
        System.out.println("Has Cycle (Example 2): " + obj.hasCycle(head2)); // true

    }
}

// Input: head = [3,2,0,-4], pos = 1
// Output: true

// Input: head = [1,2], pos = 0
// Output: true

// Input: head = [1], pos = -1
// Output: false