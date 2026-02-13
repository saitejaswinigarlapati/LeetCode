from typing import Counter

class Solution:
    def findLHS(self, nums):
        frequency_map = Counter(nums)
        max_length = 0

        for num in frequency_map:
            if num + 1 in frequency_map:
                current_length = frequency_map[num] + frequency_map[num + 1]
                max_length = max(max_length, current_length)

        return max_length
    
    
s=Solution()
nums=[1,3,2,2,5,2,3,7]
print(s.findLHS(nums))