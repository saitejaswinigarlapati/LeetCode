class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        res=maxsum=sum(nums[:k])
        for i in range(k,len(nums)):
            res=res+nums[i] -nums[i-k]
            maxsum=max(res,maxsum)

        return maxsum/k
    
    
s=Solution()

n=int(input("Number of test cases: "))
for i in range(n):
    
    nums=list(map(int,input("Enters nums :").split()))
    k=int(input("Value of k: "))
    print(f"Max average subarray : {s.findMaxAverage(nums,k)}")