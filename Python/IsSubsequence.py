class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l=0
        r=0
        while l<len(s) and r<len(t):
            if s[l]==t[r]:
                l+=1
            r+=1
        return l==len(s)
    
obj=Solution()

t=input("t : ")
s=input("s : ")
res=obj.isSubsequence(s,t)
print(f"Is subsequence : {res}")

# Input: s = "abc", t = "ahbgdc"
# Output: true

# Input: s = "axc", t = "ahbgdc"
# Output: false