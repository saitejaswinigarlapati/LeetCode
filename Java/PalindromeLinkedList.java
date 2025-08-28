class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Compare both halves
        ListNode first = head, second = prev;
        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        PalindromeLinkedList obj = new PalindromeLinkedList();
        boolean result = obj.isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}
