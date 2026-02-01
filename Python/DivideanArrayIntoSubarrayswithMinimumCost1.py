from typing import List

class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        first=float('inf')
        second=float('inf')

        for i in range(1,len(nums)):
            if nums[i]< first:
                second=first
                first=nums[i]
            elif nums[i]<second:
                second=nums[i]
        return nums[0]+first+second

s=Solution()

nums=[1,2,3,12]
print('minimum possible sum: ',s.minimumCost(nums))