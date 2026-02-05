class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        ps=num**(0.5)
        return ps == int(ps)
            
s=Solution()
n=16
print(f"Is {n} perfect square: {s.isPerfectSquare(n)}")
