from typing import List

class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        n=len(pref)
        count=0
        for i in words:
            if i[:n]==pref:
                count+=1
        return count
    
s=Solution()

words = ["pay","attention","practice","attend"]
pref = "at"

# Output: 2

# words = ["leetcode","win","loops","success"]
# pref = "code"

# Output: 0

print("Total number of word with given prefix: ",s.prefixCount(words,pref))

