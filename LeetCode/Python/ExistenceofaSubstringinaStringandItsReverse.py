class Solution:
    def isSubstringPresent(self, s: str) -> bool:
        pairs={s[i-1:i+1] for i in range(1,len(s))}
        return any(p[::-1] in pairs for p in pairs)
    

obj=Solution()
s = "leetcode"
print(obj.isSubstringPresent(s))