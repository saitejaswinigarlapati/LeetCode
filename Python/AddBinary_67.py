class Solution:
    def addBinary(self, a: str, b: str) -> str:
        result =bin(int(a,2)+int(b,2))[2:]
        return result
    
s=Solution()
n=int(input("Number of testcases : "))

for i in range(n):
    a,b=input("Enter 2 binary strings : ").split()
    print(f"Binary addition : {s.addBinary(a,b)}")