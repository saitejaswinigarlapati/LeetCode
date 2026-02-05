class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNodeInaLinkedList {
    
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        ListNode nodeToDelete = head.next;

        DeleteNodeInaLinkedList obj = new DeleteNodeInaLinkedList();
        obj.deleteNode(nodeToDelete);

        System.out.print("After Deleting 5: ");
        printList(head);
    }
}


// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]

// Input: head = [4,5,1,9], node = 1
// Output: [4,5,9]