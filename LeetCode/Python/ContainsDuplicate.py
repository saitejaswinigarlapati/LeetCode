from typing import List 
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s={}
        for i in nums:
            if i in s :
                return True
            else:
                s[i]=1
        return False
s=Solution()
ls=list(map(int,input("Enter elements : ").split()))
if s.containsDuplicate(ls):
    print("Duplicates exists")
else:
    print("All unique elements.")