from typing import Optional

class ListNode:
    def __init__(self,val):
        self.val=val
        self.next=None
        
class Solution:
    def mergeTwoLists(self,list1:Optional[ListNode],list2:Optional[ListNode]):
        dummy =ListNode(0)
        curr=dummy
        while list1 and list2:
            if list1.val > list2.val:
                curr.next=list2
                list2=list2.next
            else:
                curr.next=list1
                list1=list1.next
            curr=curr.next
        if list1:
            curr.next=list1
        if list2:
            curr.next=list2
        return dummy.next
    
def list_to_ll(ls):
    if not ls:
        return None
    head=ListNode(ls[0])
    current=head
    for i in ls[1:]:
        current.next=ListNode(i)
        current=current.next
    return head

def print_ll(head):
    curr=head
    while curr:
        print(curr.val,end=' -> ')
        curr=curr.next
    print('None')


s=Solution()
list1=list_to_ll([1,2,3])
list2=list_to_ll([1,3,4])
print_ll(s.mergeTwoLists(list1,list2))


# Input: list1 = [1,2,4], list2 = [1,3,4]
# Output: [1,1,2,3,4,4]

# Input: list1 = [], list2 = [0]
# Output: [0]

# Input: list1 = [], list2 = []
# Output: []