import statistics
class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        nums=nums1+nums2
        return statistics.median(nums)
        
        
s=Solution()
n=int(input("Enter number of test cases : "))

for i in range(n):
    m,n=map(int,input("Enter length of 2 arrays : ").split())
    print("Enter the elements of 1st array : ")
    nums1=list(map(int,input(f"Enter {m} elements with space seperation :").split()))
    nums2=list(map(int,input(f"Enter {n} elements with space seperation :").split()))
    print(f"Mediam of 2 sorted arrays : {s.findMedianSortedArrays(sorted(nums1),sorted(nums2))}")