from typing import List
from collections import Counter

class Solution:
    def findOriginalArray(self, changed: List[int]) -> List[int]:
        c = Counter(changed)

        zeros, m = divmod(c[0], 2)
        if m: return []
        ans = [0]*zeros   

        for n in sorted(c.keys()):
            if c[n] > c[2*n]: return []
            c[2*n]-= c[n]
            ans.extend([n]*c[n])

        return ans
    
s=Solution()
changed=[1,3,4,2,6,8]
print(s.findOriginalArray(changed))


# Input: changed = [1,3,4,2,6,8]
# Output: [1,3,4]

# Input: changed = [6,3,0,1]
# Output: []

# Input: changed = [1]
# Output: []
