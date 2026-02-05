class Solution:
    def bitwiseComplement(self, n: int) -> int:
        const=0
        ans=0
        if n==0:
            return 1
        while n>0:
            if n&1:
                const+=1
            else:
                ans=ans+(2**const)
                const+=1
            n=n>>1
        return ans
    
s=Solution()

n=5

print(f"{n}'s complement: {s.bitwiseComplement(n)}")