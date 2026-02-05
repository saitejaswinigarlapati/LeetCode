class Solution:
    def isPalindrome(self, x: int) -> bool:
        return True if (str(x)[::-1] == str(x)) else False
    
    
s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    a=int(input("Enter a number : "))
    result = s.isPalindrome(a)
    print(f"{a} is palindrome : {result}")
    