// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {

    // Function to remove duplicates from a sorted linked list
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5};
        ListNode head = solution.arrayToList(arr);
        ListNode updatedHead = solution.deleteDuplicates(head);
        solution.printList(updatedHead);
    }
}
