class Solution:
    def fib(self, n: int) -> int:
        result=0
        if n>1:
            result=self.fib(n-1)+self.fib(n-2)
        else:
            return n
        return result


s=Solution()

n=2
print(s.fib(n))


# Input: n = 3
# Output: 2

# Input: n = 4
# Output: 3