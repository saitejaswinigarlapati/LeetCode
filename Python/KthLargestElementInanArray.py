from typing import List
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        min_value = min(nums)
        max_value = max(nums)

        count = [0] * (max_value - min_value + 1)

        for num in nums:
            count[num - min_value] += 1
        
        remaining = k
        for i in range(len(count) - 1, -1,-1):
            remaining -= count[i] 

            if remaining <= 0:
                return i + min_value
            
            
s=Solution()
nums=list(map(int,input("Array elements : ").split()))
k=int(input("k : "))
print(f"{k}th largest element in {nums} : {s.findKthLargest(nums,k)}")