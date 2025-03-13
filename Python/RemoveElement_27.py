class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        left=0
        count=0
        for right in range(len(nums)):
            if nums[right]!=val:
                nums[left],nums[right]=nums[right],nums[left]
                left+=1
                count+=1
        return count
        
s=Solution()
n=int(input("Numbber of test cases : "))
for i in range(n):
    print("Enter array elements : ")
    nums=list(map(int,input().split()))
    val=int(input("Value : "))
    print(s.removeElement(nums,val))