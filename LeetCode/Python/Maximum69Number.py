class Solution:
    def maximum69Number (self, num: int) -> int:
        s=list(str(num))
        for i in range(len(s)):
            if s[i]=='6':
                s[i]='9'
                break
        return int("".join(s))

s=Solution()
num=int(input("n : "))
print("Maximum number : ", s.maximum69Number(num))

# Input: num = 9669
# Output: 9969

# Input: num = 9996
# Output: 9999

# Input: num = 9999
# Output: 9999