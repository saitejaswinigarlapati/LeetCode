class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        prev = -1
        
        for token in s.split():
            if token.isdigit():
                num = int(token)
                if num <= prev:
                    return False
                prev = num
        
        return True
    
obj=Solution()
s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
print(obj.areNumbersAscending(s))

# Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
# Output: true

# Input: s = "hello world 5 x 5"
# Output: false