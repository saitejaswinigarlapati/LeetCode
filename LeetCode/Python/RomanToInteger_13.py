class Solution:
    def romanToInt(self, s: str) -> int:
        result=0
        previous =0
        d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        for i in reversed(s):
            current=d[i]
            if current < previous:
                result -= current
            else:
                result += current
            previous = current
        return result
    
    
s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    a=input("Enter a Roman number : ")
    result = s.romanToInt(a)
    print(f"Integer Value of {a}  : {result}")
    