class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        aboveRow = [1] * n

        for _ in range(m - 1):
            currentRow = [1] * n
            for i in range(1, n):
                currentRow[i] = currentRow[i-1] + aboveRow[i]
            aboveRow = currentRow
        
        return aboveRow[-1]
    
s=Solution()

m = 3
n = 7

print("Number of possible unique paths: ",s.uniquePaths(m,n))


# Test Cases

# Input: m = 3, n = 7
# Output: 28

# Input: m = 3, n = 2
# Output: 3