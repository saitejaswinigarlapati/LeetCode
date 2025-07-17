from typing import List
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        arr=[1]*len(nums)
        for i in range(1,len(nums)):
            for j in range(0,i):
                if nums[j]<nums[i]:
                    if arr[j]+1>arr[i]:
                        arr[i]=arr[j]+1
        return max(arr)


class Sequence:
    def sequenceOfElements(self,nums:List[int]) -> int:
        arr=[1]*len(nums)
        prev=[-1]*len(nums)
        
        max_len=0
        max_index=0
        for i in range(1,len(nums)):
            for j in range(0,i):
                if nums[j]<nums[i]:
                    if arr[j]+1>arr[i]:
                        arr[i]=arr[j]+1
                        prev[i]=j
            if arr[i]>max_len:
                max_len=arr[i]
                max_index=i
        lis = []
        while max_index != -1:
            lis.append(nums[max_index])
            max_index = prev[max_index]

        lis.reverse()
        return lis

s=Solution()
ss=Sequence()
n=int(input("Number of test cases : "))
for i in range(n):
    nums=list(map(int,input("Array elements with space seperation : ").split()))
    print("Length of longest increasing subsequence : ",s.lengthOfLIS(nums))
    print("Sequence of elements : ",ss.sequenceOfElements(nums))
    
    


