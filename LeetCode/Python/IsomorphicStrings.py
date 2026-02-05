class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sl={}
        tl={}
        for i in range(len(s)):
            if s[i] not in sl:
                sl[s[i]]=i
            if t[i] not in tl:
                tl[t[i]]=i
            if sl[s[i]] != tl[t[i]]:
                return False
        return True
        
obj=Solution()
s=input("s : ")
t=input("t : ")
print(f"Is Isomorphic : {obj.isIsomorphic(s,t)}")

# Input: s = "egg", t = "add"
# Output: true

# Input: s = "foo", t = "bar"
# Output: false

# Input: s = "paper", t = "title"
# Output: true