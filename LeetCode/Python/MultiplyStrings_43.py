class Solution:
    def multiply(self, num1: str, num2: str) -> str:
       return str(int(num1) * int(num2))

s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    num1,num2=input("Enter 2 numbers : ").split()
    result = s.multiply(num1,num2)
    print(f"Result : {result}")