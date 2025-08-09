from typing import List

class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans=[-1]*len(nums1)
        for i in nums1:
            for j in range(nums2.index(i),len(nums2)):
                if nums2[j]>i:
                    ans[nums1.index(i)]=nums2[j]
                    break
        return ans
    
s=Solution()
nums1 = [4,1,2]
nums2 = [1,3,4,2]
print(s.nextGreaterElement(nums1,nums2))