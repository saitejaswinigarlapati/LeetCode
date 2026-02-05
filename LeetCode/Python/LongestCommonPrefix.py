from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        first_element=strs[0]
        last_element=strs[len(strs)-1]
        longest_prefix=''
        for index in range(min(len(first_element),len(last_element))):
            if first_element[index]!=last_element[index]:
                longest_prefix=longest_prefix
                break
            else:
                longest_prefix+=first_element[index]
        return longest_prefix


s=Solution()
strs = ["flower","flow","flight"]
print('Longest common prefix : ',s.longestCommonPrefix(strs))



# Input :strs = ["flower","flow","flight"]
# Output: "fl"

# Input: strs = ["dog","racecar","car"]
# Output: ""