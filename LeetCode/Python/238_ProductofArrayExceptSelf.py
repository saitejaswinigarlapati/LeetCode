from typing import List
import math

def productExceptSelf(nums: List[int]) -> List[int]:
        n=len(nums)
        answer=[1]*n
        prefix = 1
        for i in range(n):
            answer[i] = prefix
            prefix *= nums[i]
        suffix = 1
        print("s")
        for i in range(n - 1, -1, -1):
            answer[i] *= suffix
            suffix *= nums[i]
        return answer
    
nums=[-1,1,0,-3,3]
print(productExceptSelf(nums))