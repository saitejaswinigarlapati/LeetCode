class Solution:
    def longestPalindrome(self, s: str) -> int:
        a={}
        b=0
        for c in s:
            a[c]=a.get(c,0)+1
        for v in a.values():
            b+=v if v%2==0 else v-1
        return b+1 if b<len(s) else b
        
s=Solution()
n=int(input("number of test cases : "))
for i in range(n):
    a=input("string : ")
    print(s.longestPalindrome(a))
