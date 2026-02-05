def lengthOfLastWord(s: str) -> int:
    words=s.split()
    lenght_of_last_word=len(words[-1])
    return lenght_of_last_word
    
s="Hello World"
print("Length of last word: ",lengthOfLastWord(s))


# Input: s = "Hello World"
# Output: 5

# Input: s = "   fly me   to   the moon  "
# Output: 4

# Input: s = "luffy is still joyboy"
# Output: 6