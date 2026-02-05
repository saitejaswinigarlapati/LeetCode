from typing import List

class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        n=len(words)
        count=0
        for i in range(n):
            for j in range(i+1,n):
                if words[j].startswith(words[i]) and words[j].endswith(words[i]):
                    count+=1
        return count
    
s=Solution()

words = ["a","aba","ababa","aa"]
print("number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true:",s.countPrefixSuffixPairs(words))

# Output: 4

# Input: words = ["pa","papa","ma","mama"]
# Output: 2