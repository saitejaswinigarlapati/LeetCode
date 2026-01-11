'''
Docstring for 1534_CountGoodTriplets

Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c
Where |x| denotes the absolute value of x.

Return the number of good triplets.


Test Cases:

Input: arr[3,0,1,1,9,7], a=7, b=2, c=3
Output: 4

Input: arr[1,1,2,2,3], a=0, b=0, c=1
Output: 0

'''
from typing import List

class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        n=len(arr)
        goodTriplets=0
        # for i in range(n-2):
        #     for j in range(i+1,n-1):
        #         for k in range(j+1,n):
        #             if abs(arr[i]-arr[j]) <= a and \
        #             abs( arr[j] - arr[k] ) <=b and  \
        #             abs(arr[i] - arr[k])<=c:
                        
        #                 goodTriplets+=1
        
        ## Opyimized Version:
        
        for i in range(n-2):
            for j in range(i+1,n):
                if abs(arr[i]-arr[j]) <=a:
                    for k in range(j+1,n):
                        if abs(arr[j] - arr[k]) <= b and abs(arr[i] - arr[k]) <= c:
                            goodTriplets += 1
        return goodTriplets
    

arr=[3,0,1,1,9,7]
a=7
b=2
c=3

s=Solution()

print("Good Triplets: ",s.countGoodTriplets(arr,a,b,c))
