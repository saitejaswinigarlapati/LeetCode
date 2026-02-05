from typing import List

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s = list(set(nums))
        s.sort()

        if len(s) >= 3:
            return s[-3]
        else:
            return s[-1]

s=Solution()
nums=[2,3,2,1]
print(f"Third maximun element in {nums}: {s.thirdMax(nums)}")
