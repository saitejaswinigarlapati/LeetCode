from typing import List

class Solution:
    def trap(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        l_max=0
        r_max=0
        total=0

        while l <= r:
            if height[l] <= height[r]:
                if l_max <= height[l]:
                    l_max=height[l]
                else:
                    total+=l_max-height[l]
                l+=1
            else:
                if r_max > height[r]:
                    total+=r_max-height[r]
                else:
                    r_max=height[r]
                r-=1
        return total


s=Solution()

heights=[0,1,0,2,1,0,1,3,2,1,2,1]

print("Water it can trap: ",s.trap(heights))