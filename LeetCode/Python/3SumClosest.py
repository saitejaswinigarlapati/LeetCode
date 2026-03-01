## Leetcode: 16

from typing import List

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        close_sum=float('inf')
        min_diff=float('inf')
        n=len(nums)

        for i in range(n-2):
            left=i+1
            right=n-1
            while left < right:
                curr_sum=nums[i]+nums[left]+nums[right]
                curr_diff=abs(target-curr_sum)

                if min_diff > curr_diff:
                    close_sum=curr_sum
                    min_diff=curr_diff

                if curr_sum < target:
                    left+=1
                else:
                    right-=1
        return close_sum

        
s=Solution()
nums=[-1,2,1,-4]
target=1

print(s.threeSumClosest(nums,target))