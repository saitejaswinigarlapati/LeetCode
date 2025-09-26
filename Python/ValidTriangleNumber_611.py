class Solution:
    def triangleNumber(self, nums: list[int]) -> int:
        nums.sort()
        n=len(nums)
        count=0
        for i in range(n-1,-1,-1):
            left,right=0,i-1
            while left<right:
                if nums[left]+nums[right]>nums[i]:
                    count+=right-left
                    right-=1
                else:
                    left+=1
        return count
    
s=Solution()

nums=[2,2,3,4]
print("Number of Valid combinations are: ",s.triangleNumber(nums))


# Input: nums = [2,2,3,4]
# Output: 3

# Input: nums = [4,2,3,4]
# Output: 4