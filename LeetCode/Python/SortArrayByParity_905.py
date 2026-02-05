
'''
905. Sort Array By Parity

'''

from typing import List

class Solution:
    def sortArrayByParity(self,nums:List[int]) -> List[int]:
        l=0
        r=len(nums)-1
        while l<r:
            if nums[l]%2==0:
                l+=1
            else:
                nums[l],nums[r]=nums[r],nums[l]
                r-=1
        return nums
    
s=Solution()

nums=[3,1,2,4]

print("Array satisfies the given condition :",s.sortArrayByParity(nums))

# Input: nums = [3,1,2,4]
# Output: [2,4,3,1]

# Input: nums = [0]
# Output: [0]