from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pair_index={} 
        for i ,num in enumerate(nums):
            req=target-num
            if req in pair_index:
                return [i,pair_index[req]]
            pair_index[num]=i
        return []
    
s=Solution()

nums = [2,7,11,15]
target = 9

print(s.twoSum(nums,target))


# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]

# Input: nums = [3,2,4], target = 6
# Output: [1,2]

# Input: nums = [3,3], target = 6
# Output: [0,1]