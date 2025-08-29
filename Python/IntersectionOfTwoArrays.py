from typing import List

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        nums1 = set(nums1)
        nums2 = set(nums2)
        for i in nums1 :
            if i in nums2 :
                result.append(i)
        return result
    
s=Solution()

nums1 = [1,2,2,1]
nums2 = [2,2]
print(s.intersection(nums1,nums2))


# Input: nums1 = [1,2,2,1], nums2 = [2,2]
# Output: [2]

# Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
# Output: [9,4]

