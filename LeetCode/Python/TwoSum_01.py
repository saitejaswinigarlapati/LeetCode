from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic={}
        for i,num in enumerate(nums):
            req=target-num
            if req in dic:
                return [i,dic[req]]
            dic[num]=i
        return []
    
s=Solution()
ls=[3,2,4]
target=6

print(s.twoSum(ls,target))