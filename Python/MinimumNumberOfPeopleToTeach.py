from typing import List
class Solution:
    def minimumTeachings(self, n: int, languages: List[List[int]], friendships: List[List[int]]) -> int:
        need = set()
        for u, v in friendships:
            u -= 1
            v -= 1
            ok = False
            for x in languages[u]:
                if x in languages[v]:
                    ok = True
                    break
            if not ok:
                need.add(u)
                need.add(v)

        ans = len(languages) + 1
        for i in range(1, n + 1):
            cans = 0
            for v in need:
                if i not in languages[v]:
                    cans += 1
            ans = min(ans, cans)
        return ans
    
    
s=Solution()

n = 2
languages = [[1],[2],[1,2]]
friendships = [[1,2],[1,3],[2,3]]
print("Minimum Teachings : ",s.minimumTeachings(n,languages,friendships))

