from collections import Counter
def findTheDifference(s: str, t: str) -> str:
    
        count_s=Counter(s)
        count_t=Counter(t)
        for char in count_t:
            if count_t[char] != count_s.get(char, 0):
                return char
            
s='abcd'
t='abcde'
print(findTheDifference(s,t)," is the addesd letter")

# Input: s = "abcd", t = "abcde"
# Output: "e"
# Input: s = "", t = "y"
# Output: "y"