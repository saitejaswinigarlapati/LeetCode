class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        if not digits:
            return []
        d={
            '2':'abc','3':'def','4':'ghi','5':'jkl',
            '6':'mno','7':'pqrs','8':'tuv','9':'wxyz'
        }
        l=['']
        for i in digits:
            s=[]
            for j in l:
                for k in d[i]:
                    s.append(j+k)
            l=s
        return l

s=Solution()
n=int(input("Number of test cases : "))
for i in range(n):
    l=input("Enter string :")
    print(f"Possible Combinations : {s.letterCombinations(l)}")