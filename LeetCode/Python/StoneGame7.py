
from typing import List
class Solution:
    def stoneGameVII(self, stones: List[int]) -> int:
        n=len(stones)

        prefix=[0]*(n+1)
        for i in range(n):
            prefix[i+1]=prefix[i]+stones[i]
        def range_sum(i,j):
            return prefix[j+1]-prefix[i]
        dp=[[0]*n for _ in range(n)]

        for l in range(2,n+1):
            for i in range(n-l +1):
                j=i+l-1
                dp[i][j]=max(range_sum(i+1,j)-dp[i+1][j], range_sum(i,j-1)-dp[i][j-1])
        return dp[0][n-1]
    
s=Solution()

stones=[5,3,1,4,2]
print(f'Difference in Alice and Bob\'s score: {s.stoneGameVII(stones)}')

# Input: stones = [5,3,1,4,2]
# Output: 6

# Input: stones = [7,90,5,1,100,10,10,2]
# Output: 122