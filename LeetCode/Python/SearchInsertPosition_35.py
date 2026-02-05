class Solution:
    def searchInsert(self, nums: list[int], target: int) -> int:
        l=0
        r=len(nums)-1
        while l<=r:
            mid=(l+r)//2
            if nums[mid] == target:
                return mid
            elif nums[mid]>target:
                r=mid-1
            else:
                l= mid +1
        return l
    
s=Solution()

n=int(input("Enter number of test cases: "))
for i in range(n):
    print("Enter array elements with space seperation : ")
    array=list(map(int,input().split()))
    target=int(input("Target : "))
    print(s.searchInsert(array,target))