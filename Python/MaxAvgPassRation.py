from typing import List
import heapq

class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        n=len(classes)
        sum=0
        A=[]
        for p,q in classes:
            sum+=p/q
            A.append(((p-q)/(q*(q+1)),p,q))
        heapq.heapify(A)

        for _ in range(extraStudents):
            (r,p,q)=A[0]
            if r==0:
                break
            sum-=r
            r2=(p-q)/((q+1.0)*(q+2.0))
            heapq.heapreplace(A,(r2,p+1,q+1))
        return sum/n

s=Solution()
classes = [[1,2],[3,5],[2,2]]
extraStudents = 2
print(s.maxAverageRatio(classes,extraStudents))



# Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
# Output: 0.78333

# Input: classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
# Output: 0.53485