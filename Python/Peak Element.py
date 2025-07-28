from typing import List
class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        left=0
        right=len(nums)-1
        while left<right:
            mid=(left+right)//2
            if nums[mid]>nums[mid+1]:
                right=mid
            else:
                left=mid+1
        return left


s=Solution()
nums=list(map(int,input("nums : ").split()))
res=s.findPeakElement(nums)
print("Index of peak element : ",res)
print("Peak Element value : ",nums[res])
