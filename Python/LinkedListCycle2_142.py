# Definition for singly-linked list.
from typing import Optional
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s=set()
        temp=head
        while temp != None:
            if temp in s:
                return temp
            else:
                s.add(temp)
                temp=temp.next

        return  None
    
s=Solution()

n1=ListNode(3)
n2=ListNode(2)
n3=ListNode(0)
n4=ListNode(-4)
n1.next=n2
n2.next=n3
n3.next=n4
n4.next=None
res=s.detectCycle(n1)

if res==None:
    print("no cycle")
else:   
    print("tail connects to node index",res.val)
        