from typing import List
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        seen = {}

        for i, val in enumerate(nums):
            if val in seen and i - seen[val] <= k:
                return True
            else:
                seen[val] = i
        
        return False
    
s=Solution()
ls=list(map(int,input("Enter elements : ").split()))
k=int(input("k :"))
if s.containsNearbyDuplicate(ls,k):
    print("True")
else:
    print("False")
