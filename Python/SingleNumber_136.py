class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        a=0
        for i in nums:
            a^=i
        return a
            
        
s= Solution()

n= int(input("Enter number of test cases: "))
for i in range(n):
    l=list(map(int,input("Enteer array elements : ").split()))
    print(f"Single Number : {s.singleNumber(l)}")