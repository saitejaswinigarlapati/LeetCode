from typing import List

class Solution:
    def numberOfPairs(self, points: List[List[int]]) -> int:
        points.sort(key=lambda x: (x[0], -x[1]))
        cnt = 0
        for i in range(len(points) - 1):
            x, y = points[i]
            lower = -1
            for j in range(i + 1, len(points)):
                if lower < points[j][1] <= y:
                    cnt += 1
                    lower = points[j][1]
                if lower == y: break
        return cnt
    
s=Solution()
points = [[6,2],[4,4],[2,6]]
print(s.numberOfPairs(points))


# Input: points = [[1,1],[2,2],[3,3]]
# Output: 0

# Input: points = [[6,2],[4,4],[2,6]]
# Output: 2

# Input: points = [[3,1],[1,3],[1,1]]
# Output: 2