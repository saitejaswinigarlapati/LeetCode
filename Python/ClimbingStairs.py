class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1:
            return 1
        else:
            no_of_ways=[1,2] # for n=1 and n=2
            for i in range(2,n):
                no_of_ways.append(no_of_ways[i-1]+no_of_ways[i-2])
        return no_of_ways[-1]
    

s=Solution()
n=2
print("Distinct ways : ",s.climbStairs(n))

# Input: n = 2
# Output: 2

# Input: n = 3
# Output: 3