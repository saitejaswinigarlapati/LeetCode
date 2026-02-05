from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start=0
        end=len(nums)-1
        middle=0
        while middle<=end:
            match nums[middle]:
                case 0:
                    nums[start],nums[middle]=nums[middle],nums[start]
                    start+=1
                    middle+=1
                case 1:
                    middle+=1
                case 2:
                    nums[middle],nums[end]=nums[end],nums[middle]
                    end-=1
                
s=Solution()
nums = [2,0,2,1,1,0]
s.sortColors(nums)
print(nums)

# Input: nums = [2,0,2,1,1,0]
# Output: [0,0,1,1,2,2]

# Input: nums = [2,0,1]
# Output: [0,1,2]