from typing import List

class Solution:
    def canPlaceFlowers(self,flowerbed:List[int],n:int) -> bool:
        for i in range(len(flowerbed)):
            if flowerbed[i]==0:
                left=(i==0) or (flowerbed[i-1]==0)
                right=(i==len(flowerbed)-1) or (flowerbed[i+1] ==0)
                
                if left and right:
                    flowerbed[i]=1
                    n-=1
                    if n==0:
                        return True
        return n <= 0
    
s=Solution()


flowerbed = [1,0,0,0,1]
n = 1
print(f"Can plant flowers : {s.canPlaceFlowers(flowerbed,n)}")