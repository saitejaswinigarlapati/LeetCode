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

class RemoveLinkedListElements{
    public ListNode removeElements(ListNode head,int val){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next != null){
            if(curr.next.val== val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }

    public ListNode printLL(ListNode head){
        ListNode curr=head;
        while (curr!=null){
            System.out.print(curr.val + " -> ");
            curr=curr.next;
        }
        System.out.println("null");
        return head;
    }
    public static void  main(String[] args){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6,
                        new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        RemoveLinkedListElements obj = new RemoveLinkedListElements();
        System.out.print("Original List: ");
        obj.printLL(head);

        head = obj.removeElements(head, 6);
        System.out.print("After Removing 6: ");
        obj.printLL(head);
    }
}