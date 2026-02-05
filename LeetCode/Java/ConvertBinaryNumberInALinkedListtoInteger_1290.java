

// Definition for singly-linked list.
class ListNode {
    int val;
        ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ConvertBinaryNumberInALinkedListtoInteger_1290 {
    
    public int getDecimalValue(ListNode head) {

        StringBuilder s = new StringBuilder();
        ListNode start=head;
        while(start != null){
            s.append(start.val);
            start=start.next;
        }
        return Integer.parseInt(s.toString(), 2);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(1);

        head.next = second;
        second.next = third;

        ConvertBinaryNumberInALinkedListtoInteger_1290 solution = new ConvertBinaryNumberInALinkedListtoInteger_1290();

        // Call the method and print the result
        int decimalValue = solution.getDecimalValue(head);
        System.out.println("Binary value of the given linked list: "+decimalValue);
    }
}
