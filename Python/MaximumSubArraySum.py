from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res = nums[0]
        total = 0

        for n in nums:
            if total < 0:
                total = 0

            total += n
            res = max(res, total)
        
        return res
    
s=Solution()

nums=[-2,1,-3,4,-1,2,1,-5,4]

print("Maximum subarraysum: ",s.maxSubArray(nums))