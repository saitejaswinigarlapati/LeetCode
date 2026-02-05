
'''

3819. Rotate Non Negative Elements

You are given an integer array nums and an integer k.

Rotate only the non-negative elements of the array to the left by k positions, in a cyclic manner.

All negative elements must stay in their original positions and must not move.

After rotation, place the non-negative elements back into the array in the new order, filling only the positions that originally contained non-negative values and skipping all negative positions.

Return the resulting array.

'''


from typing import List

class Solution:
    def rotateElements(self, nums: List[int], k: int) -> List[int]:
        n=len(nums)
        idx=[]
        vals=[]
        for i,num in enumerate(nums):
            if num>=0:
                idx.append(i)
                vals.append(num)

        if len(vals) <=1:
            return nums
        k%=len(vals)
        vals=vals[k:]+vals[:k]
        for i,v in zip(idx,vals):
            nums[i]=v
        return nums
s=Solution()

nums=[1,-2,3,-4]
k=3

print(s.rotateElements(nums,k))

# Input: nums = [1,-2,3,-4], k = 3
# Output: [3,-2,1,-4]

# Input: nums = [-3,-2,7], k = 1
# Output: [-3,-2,7]

# Input: nums = [5,4,-9,6], k = 2
# Output: [6,5,-9,4]