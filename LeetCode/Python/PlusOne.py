from typing import List
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n=len(digits)
        for i in range(n-1,-1,-1):
            if digits[i]!=9:
                digits[i]+=1
                return digits
            
            digits[i]=0
        return [1] + digits
    
# Example usage:
digits1=[1,2,3]
digits2=[9,9,9]
solution=Solution()
print(solution.plusOne(digits1))
print(solution.plusOne(digits2))