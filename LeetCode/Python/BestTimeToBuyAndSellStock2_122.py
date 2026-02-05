from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                profit+=prices[i]-prices[i-1]

        return profit
        
s=Solution()
n=int(input("Number of test cases : "))

for i in range(n):
    ls=list(map(int,input("Stock Prices: ").split()))
    print(f"Max Profit : {s.maxProfit(ls)}")
    
    
# Input: prices = [7,1,5,3,6,4]
# Output: 7

# Input: prices = [1,2,3,4,5]
# Output: 4

# Input: prices = [7,6,4,3,1]
# Output: 0