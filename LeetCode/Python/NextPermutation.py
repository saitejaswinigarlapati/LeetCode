from typing import List

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 1
        while i > 0 and nums[i-1] >= nums[i]:
            i -= 1
        
        if i == 0:
            nums.reverse()
            return
        
        j = len(nums) - 1
        while j >= i and nums[j] <= nums[i-1]:
            j -= 1
        
        nums[i-1], nums[j] = nums[j], nums[i-1]

        nums[i:] = reversed(nums[i:])
        
s=Solution()
nums=[1,2,3]
s.nextPermutation(nums)
print(nums)


# Input: nums = [1,2,3]
# Output: [1,3,2]

# Input: nums = [3,2,1]
# Output: [1,2,3]

# Input: nums = [1,1,5]
# Output: [1,5,1]