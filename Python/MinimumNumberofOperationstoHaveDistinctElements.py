class Solution(object):
    def minOperations(self, nums):
        seen = set()
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] in seen:
                return (i // 3) + 1
            seen.add(nums[i])
        return 0
    
s=Solution()

nums = [3,8,3,6,5,8]
print(f'Number of Operations required: {s.minOperations(nums)}')


# Input: nums = [2,2]
# Output: 1

# Input: nums = [3,8,3,6,5,8]
# Output: 1

# Input: nums = [4,3,5,1,2]
# Output: 0