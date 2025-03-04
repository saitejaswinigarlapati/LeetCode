class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        n=len(digits)
        for i in range(n-1,-1,-1):
            if digits[i]<9:
                digits[i]+=1
                return digits
            digits[i]=0
        return [1] + digits
        
s=Solution()
n=int(input("Number of testcases : "))
for i in range(n):
    print("Enter array elements with space seperation : ")
    array=list(map(int,input().split()))
    print(s.plusOne(array))