from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Merges nums2 into nums1 in-place.
        """
        k = m + n - 1
        i = m - 1
        j = n - 1

        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # Copy remaining elements from nums2 (if any)
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1


s = Solution()
n = int(input("Number of test cases: "))
for _ in range(n):
    nums1_input = list(map(int, input("Enter nums1 (m elements): ").split()))
    nums2 = list(map(int, input("Enter nums2 (n elements): ").split()))
    
    m = len(nums1_input)
    n2 = len(nums2)

    nums1 = nums1_input + [0] * n2

    print(f"Before merge:\nnums1: {nums1}\nnums2: {nums2}")
    s.merge(nums1, m, nums2, n2)
    print(f"Merged array: {nums1}\n")
