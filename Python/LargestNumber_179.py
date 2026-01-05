from functools import cmp_to_key

class Solution:
    def largestNumber(self, nums):
        
        def cmp_func(x, y):
            if x + y > y + x:
                return 1
            elif x == y:
                return 0
            else:
                return -1
            
        nums = [str(num) for num in nums]
        
        nums.sort(key = cmp_to_key(cmp_func), reverse = True)
        
        return ''.join(nums).lstrip('0') or '0'
    

s=Solution()
nums=[3,30,34,5,9]

print(s.largestNumber(nums))