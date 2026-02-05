class Solution:
    def simplifyPath(self, path: str) -> str:
        s=path.split('/')
        stack=[]

        for i in s:
            if i == "" or i == ".":
                continue
            if i=='..':
                if stack:
                    stack.pop()
            else:
                stack.append(i)
        return  '/' + '/'.join(stack)
        
s=Solution()
path = "/home/"

print(s.simplifyPath(path))

# Input: path = "/home/"
# Output: "/home"


# Input: path = "/home//foo/"
# Output: "/home/foo"

# Input: path = "/home/user/Documents/../Pictures"
# Output: "/home/user/Pictures"