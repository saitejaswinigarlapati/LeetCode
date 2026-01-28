## 2187. Minimum Time to Complete Trips

from typing import List
class Solution:
    def minimumTime(self, time: List[int], totalTrips: int) -> int:
        low = 1
        high = min(time) * totalTrips

        while low < high:
            mid = (low + high) // 2
            trips = sum(mid // t for t in time)

            if trips >= totalTrips:
                high = mid
            else:
                low = mid + 1

        return low
    
s=Solution()
time = [1,2,3]
totalTrips = 5 # Output: 3
print(f"Minimum time required: {s.minimumTime(time,totalTrips)}")

# Input: time = [1,2,3], totalTrips = 5
# Output: 3

# Input: time = [2], totalTrips = 1
# Output: 2