from typing import List

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        l=len(s)
        right=l-1
        left=0
        while left<=right:
            s[left],s[right]=s[right],s[left]
            left+=1
            right-=1
        return s
    
obj=Solution()
s=["h","e","l","l","o"]

print("Reversed string: ",obj.reverseString(s))