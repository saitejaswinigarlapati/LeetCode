class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s=sorted(s)
        t=sorted(t)
        return s==t
    
obj=Solution()

s = "anagram"
t = "nagaram"

print("Anagrams : ",obj.isAnagram(s,t))

# Input: s = "anagram", t = "nagaram"
# Output: true

# Input: s = "rat", t = "car"
# Output: false

