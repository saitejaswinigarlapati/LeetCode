class Solution:
    def reverse(self, x: int) -> int:
        result = -1 if x<0 else 1
        rev =int(str(abs(x))[::-1]) *result
        return rev if -(2**31) <= rev <= (2**31 - 1) else 0
    
s= Solution()

n= int(input("Enter number of test cases : "))
for i in range(n):
    a=int(input("Enter a number : "))
    result=s.reverse(a)
    print(f"Reverse Integer : {result}")