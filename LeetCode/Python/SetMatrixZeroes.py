from typing import List

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows=set()
        cols=set()
        m=len(matrix)
        n=len(matrix[0])
        for i in range(m):
            for j in range(n):
                if matrix [i][j]==0:
                    rows.add(i)
                    cols.add(j)
        for r in rows:
            for j in range(n):
                matrix[r][j]=0
        for c in cols:
            for i in range(m):
                matrix[i][c]=0
        return matrix
        
        
s=Solution()

matrix = [[1,1,1],[1,0,1],[1,1,1]]

print("Before :" , matrix)

s.setZeroes(matrix)

print("After : ",matrix)
