from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        left, right = 0, len(nums) - 1
        
        while left <= right:
            mid = (left + right) // 2
            
            if nums[mid] == target:
                return True
            
            if nums[mid] == nums[left]:
                left += 1
                continue

            if nums[left] <= nums[mid]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        
        return False
    
s=Solution()

nums = [2,5,6,0,0,1,2]
target = 0

print(s.search(nums,target))

# Input: nums = [2,5,6,0,0,1,2], target = 0
# Output: true

# Input: nums = [2,5,6,0,0,1,2], target = 3
# Output: false