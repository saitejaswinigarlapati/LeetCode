class Solution:
    def minMovesToSeat(self, seats, students):
        seats.sort()
        students.sort()
        ans = 0
        for i in range(len(seats)):
            ans += abs(seats[i] - students[i])
        return ans

                
s=Solution()
seats = [3,1,5]
students = [2,7,4]

print('Min number of moves: ',s.minMovesToSeat(seats,students))

# Input: seats = [3,1,5], students = [2,7,4]
# Output: 4
# Input: seats = [4,1,5,9], students = [1,3,2,6]
# Output: 7


