class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n <=0:
            return False
        while n % 4 == 0:
            n //= 4
        return n == 1
    
s=Solution()

n=int(input("n : "))
print(f"{n} is power of four : {s.isPowerOfFour(n)}")


# Input: n = 16
# Output: true

# Input: n = 5
# Output: false

# Input: n = 1
# Output: true
