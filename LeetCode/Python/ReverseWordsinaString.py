class Solution:
    def reverseWords(self, s: str) -> str:
        a=s.split()[::-1]
        res=[]
        for i in range(len(a)) :
            res.append(a[i])
            if i!=len(a)-1:
                res.append(" ")
        return "".join(res)

            
        
        
s=Solution()
a=input("String : ")
print(f"Reversed string : {s.reverseWords(a)}")

# Input: s = "the sky is blue"
# Output: "blue is sky the"

# Input: s = "  hello world  "
# Output: "world hello"