class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int length = 1;
        ListNode dummy = head;
        while (dummy.next != null) {
            dummy = dummy.next;
            length++;
        }

        int pos = k % length;
        if (pos == 0) {
            return head;
        }

        ListNode current = head;
        for (int i = 0; i < length - pos - 1; i++) {
            current = current.next;
        }

        ListNode new_head = current.next;
        current.next = null;
        dummy.next = head;

        return new_head;
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = createList(arr);

        System.out.println("Before rotation:");
        printList(head);

        RotateList sol = new RotateList();
        head = sol.rotateRight(head, k);

        System.out.println("After rotation:");
        printList(head);
    }
}
