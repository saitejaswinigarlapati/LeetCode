from itertools import permutations

class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]: return list(permutations(nums))
s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    print("Enter elements of list : ")
    nums=list(map(int,input().split()))
    print(f"Permutations : {s.permute(nums)}")
    