from typing import List

class Solution:
    def specialPerm(self, nums: List[int]) -> int:
        MOD = 10**9 + 7
        n = len(nums)

        # Precompute valid transitions
        valid = [[False]*n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                if i != j:
                    if nums[i] % nums[j] == 0 or nums[j] % nums[i] == 0:
                        valid[i][j] = True

        # DP array
        dp = [[0]*n for _ in range(1 << n)]

        # Initialization
        for i in range(n):
            dp[1 << i][i] = 1

        # Fill DP
        for mask in range(1 << n):
            for last in range(n):
                if not (mask & (1 << last)):
                    continue

                for nxt in range(n):
                    if mask & (1 << nxt):
                        continue
                    if valid[last][nxt]:
                        dp[mask | (1 << nxt)][nxt] = (
                            dp[mask | (1 << nxt)][nxt] + dp[mask][last]
                        ) % MOD

        # Final answer
        return sum(dp[(1 << n) - 1]) % MOD
s=Solution()
nums=[2,3,6]
print(s.specialPerm(nums))

# Input: nums = [2,3,6]
# Output: 2

# Input: nums = [1,4,3]
# Output: 2