class Solution:
    def numberOfMatches(self, n: int) -> int:
        if n==1:
            return 0
        elif n%2==0:
            return n//2 + self.numberOfMatches(n//2)
        else:
            return (n-1)//2 + self.numberOfMatches(1 + (n-1)//2)
        
s=Solution()
n=7
print(f'Number of matches played in tournament: {s.numberOfMatches(n)}')

# Input: n = 7
# Output: 6

# Input: n = 14
# Output: 13