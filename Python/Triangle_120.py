from typing import List
class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        for i in range(1,len(triangle)):
            for j in range(i+1):
                triangle[i][j] +=min(triangle[i-1][j-(j==i)],triangle[i-1][j-(j>0)])
        return min(triangle[-1])



s=Solution()
triangle = []
n = int(input("Enter number of rows in the triangle: "))

for i in range(n):
    row = list(map(int, input(f"Enter {i+1} numbers for row {i+1}, separated by space: ").split()))
    if len(row) != i + 1:
        print("Invalid row length. Try again.")
        exit()
    triangle.append(row)

print("\nTriangle entered:")
for row in triangle:
    print(row)


print(s.minimumTotal(triangle))
