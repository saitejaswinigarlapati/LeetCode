from typing import List
from collections import defaultdict
class Solution:
    def totalFriut(self,fruits :List[int])->int:
        left=0
        maxFruits=0
        basket=defaultdict(int)
        for right in range(len(fruits)):
            basket[fruits[right]]+=1
            while len(basket) >2:
                basket[fruits[left]]-=1
                if basket[fruits[left]]==0:
                    del basket[fruits[left]]
                left+=1
            maxFruits=max(maxFruits,right-left+1)
        return maxFruits
s=Solution()
fruits=list(map(int,input("Fruits : ").split()))
print(f"Max Fruits : {s.totalFriut(fruits)}")


"""
Input: fruits = [1,2,1]
Output: 3

Input: fruits = [0,1,2,2]
Output: 3

Input: fruits = [1,2,3,2,2]
Output: 4

"""