class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        
        while True:
            if n == 1:
                return True
            if n in seen:
                return False
            
            seen.add(n)
            sum = 0
            while n != 0:
                digit = n % 10
                sum += digit ** 2
                n = n // 10
            n = sum

s=Solution()
n=int(input("Enter a number to check if it is a Happy number : "))
if (s.isHappy(n)):
    print(f"{n} is a Happy number.")
else:
    print(f"{n} is not a Happy number.")