
from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy_price=prices[0]
        maxProfit=0
        for i in prices[1:]:
            buy_price=min(i,buy_price)
            maxProfit=max(maxProfit, i - buy_price)
        return maxProfit
        

s=Solution()

n=int(input("Number of test cases : "))

for i in range(n):
    ls=list(map(int,input("Stock Prices: ").split()))
    print(f"Max Profit : {s.maxProfit(ls)}")
    
    

# Input: prices = [7,1,5,3,6,4]
# Output: 5

# Input: prices = [7,6,4,3,1]
# Output: 0

