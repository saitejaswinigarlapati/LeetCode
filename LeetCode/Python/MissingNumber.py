from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        s=sum(nums)
        actual_sum=(n*(n+1))//2
        return actual_sum-s
        
        
s=Solution()
nums=[0,1,2,3,5,6,7,8]
print("Missing number : ",s.missingNumber(nums))