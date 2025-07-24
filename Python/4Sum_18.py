from typing import List

class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        res = []
        n = len(nums)

        for i in range(n-3):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            for j in range(i+1,n-2):
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue
                left,right = j+1,n-1
                while left < right:
                    total = nums[i] + nums[j] + nums[left] + nums[right]
                    if total == target:
                        res.append([nums[i],nums[j],nums[left],nums[right]])
                        left += 1
                        right -=1
                        while left < right and nums[left] == nums[left - 1]:
                            left += 1
                        while left < right and nums[right] == nums[right + 1]:
                            right -=1
                    elif total < target:
                        left += 1
                    else:
                        right -= 1
        return res
    
    
nums = list(map(int, input("Enter the numbers (space-separated): ").split()))
target = int(input("Enter the target: "))

solution = Solution()
result = solution.fourSum(nums, target)

print("Quadruplets that sum to target:")
print(result)