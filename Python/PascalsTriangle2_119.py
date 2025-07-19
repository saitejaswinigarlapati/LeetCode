from typing import List
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        row=[1]
        for i in range(rowIndex):
            next_row=[0]* (len(row)+1)
            for j in range(len(row)):
                next_row[j]+=row[j]
                next_row[j+1]=row[j]
            row=next_row
        return row

s=Solution()

n=int(input("Number of test cases :"))
for i in range(n):
    r=int(input("Row index : "))
    print(s.getRow(r))