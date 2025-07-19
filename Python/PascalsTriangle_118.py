from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows==0:
            return []
        result=[[1]]
        if numRows==1:
            return result
        for i in range(1,numRows):
            prevRow=result[i-1]
            row=[1]
            for j in range(1,i):
                row.append(result[i-1][j] + result[i-1][j-1])
            row.append(1)
            result.append(row)

        return result
        
s= Solution()

n=int(input("Enter a number of test cases : "))

for i in range(n):
    r=int(input("Number of rows : "))
    print(s.generate(r))