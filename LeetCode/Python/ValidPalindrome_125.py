class Solution:
    def isPalindrome(self, s: str) -> bool:
        x=""
        for i in s:
            if i.isalnum():
                x+=i.lower()
        y=x[::-1]
        if x==y:
            return True
        return False
    
s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    a=input("String : ")
    result = s.isPalindrome(a)
    print(f"'{a}' is valid palindrome : {result}")