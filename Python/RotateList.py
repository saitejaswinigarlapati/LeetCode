from typing import Optional

class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

def rotateRight(head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return None
        length=1
        dummy=head
        while dummy.next:
            dummy=dummy.next
            length+=1
        pos=k%length

        if pos==0:
            return head
        current=head
        for _ in range(length-pos-1):
            current=current.next

        new_head=current.next
        current.next=None
        dummy.next=head

        return new_head
    

def print_ll(head):
    temp=head
    while temp:
        print(temp.val,end=' -> ')
        temp=temp.next
    print(None)
    
def list_to_ll(ls):
    head=ListNode(ls[0],None)
    temp=head
    for i in range(1,len(ls)):
        temp.next=ListNode(ls[i])
        temp=temp.next
    return head

ls=[1,2,3,4,5]
k=2
ls=list_to_ll(ls)
print('Before rotation :')
print_ll(ls)
print('\nk :',k)
ans=rotateRight(ls,k)
print('\nAfter rotation')
print_ll(ans)


# Input: head = [1,2,3,4,5], k = 2
# Output: [4,5,1,2,3]

# Input: head = [0,1,2], k = 4
# Output: [2,0,1]
 