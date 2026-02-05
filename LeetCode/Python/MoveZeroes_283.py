class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left=0
        for right in range(len(nums)):
            if nums[right]!=0:
                nums[left],nums[right]=nums[right],nums[left]
                left+=1
        
s=Solution()
n=int(input("Numbber of test cases : "))
for i in range(n):
    print("Enter array elements : ")
    nums=list(map(int,input().split()))
    s.moveZeroes(nums)
    print(nums)