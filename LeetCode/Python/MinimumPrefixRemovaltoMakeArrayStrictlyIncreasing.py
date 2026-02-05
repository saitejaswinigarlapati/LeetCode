from typing import List

class Solution:
    def minimumPrefixLength(self, nums: List[int]) -> int:
        n=len(nums)
        i=n-1

        while i>0 and nums[i-1]<nums[i]:
            i-=1
        return i
    
s=Solution()
nums = [1,-1,2,3,3,4,5]
print(s.minimumPrefixLength(nums))


# Input: nums = [1,-1,2,3,3,4,5]
# Output: 4

# Input: nums = [4,3,-2,-5]
# Output: 3

# Input: nums = [1,2,3,4]
# Output: 0