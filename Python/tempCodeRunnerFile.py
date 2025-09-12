def lengthOfLastWord(s: str) -> int:
    words=s.split()
    lenght_of_last_word=len(words[-1])
    return lenght_of_last_word
    
s="Hello World"
print(lengthOfLastWord(s))