class Solution:
    def strStr(self,haystack : str , needle: str) -> int:
        for i in range(len(haystack)-len(needle)+1):
            if haystack[i:i+len(needle)]==needle:
                return i
        return -1
s=Solution()

haystack=input("Enter haystack : ")
needle=input("Enter needle : ")
print(s.strStr(haystack,needle))
        
        
# Input: haystack = "sadbutsad", needle = "sad"
# Output: 0

# Input: haystack = "leetcode", needle = "leeto"
# Output: -1