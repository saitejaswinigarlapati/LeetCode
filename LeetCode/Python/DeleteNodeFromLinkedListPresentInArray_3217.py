from typing import List,Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        nums=set(nums)
        temp=ListNode(0)
        temp.next=head
        curr=temp
        while curr.next:
            if curr.next.val in nums:
                curr.next=curr.next.next
            else:
                curr=curr.next
        return temp.next
    
s=Solution()

head=ListNode(1)
second=ListNode(2)
third=ListNode(3)
fourth=ListNode(4)
fifth=ListNode(5)

head.next=second
second.next=third
third.next=fourth
fourth.next=fifth

nums=[1,2,3,]
ans=s.modifiedList(nums,head)

temp = ans
while temp:
    print(temp.val,end=" -> ")
    temp=temp.next
print(None)


# Input: nums = [1], head = [1,2,1,2,1,2]
# Output: [2,2,2]

# Input: nums = [5], head = [1,2,3,4]
# Output: [1,2,3,4]

# Input: nums = [1,2,3], head = [1,2,3,4,5]
# Output: [4,5]