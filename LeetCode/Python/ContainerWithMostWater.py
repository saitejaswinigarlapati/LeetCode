class Solution:
    def maxArea(self, height: list[int]) -> int:
        max_are=0
        left=0
        right=len(height)-1
        while left<=right:
            max_are=max(max_are,min(height[left],height[right]) * (right-left))
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return max_are

s=Solution()
n=int(input("Numbber of test cases : "))
for i in range(n):
    print("Enter array elements : ")
    height=list(map(int,input().split()))
    print(s.maxArea(height))