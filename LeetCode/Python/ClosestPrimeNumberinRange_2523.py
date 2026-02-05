from math import isqrt
from typing import List

class Solution:
    def closestPrimes(self, left: int, right: int) -> List[int]:
        def sieve(n: int) -> List[int]:
            is_prime = [True] * (n + 1)
            is_prime[0] = is_prime[1] = False
            for i in range(2, isqrt(n) + 1):
                if is_prime[i]:
                    for j in range(i * i, n + 1, i):
                        is_prime[j] = False
            return [i for i in range(n + 1) if is_prime[i]]
        
        primes = sieve(right)
        primes_in_range = [p for p in primes if p >= left]
        
        if len(primes_in_range) < 2:
            return [-1, -1]
        
        closest_pair = primes_in_range[:2]
        min_diff = closest_pair[1] - closest_pair[0]
        
        for i in range(1, len(primes_in_range)):
            diff = primes_in_range[i] - primes_in_range[i - 1]
            if diff < min_diff:
                closest_pair = [primes_in_range[i - 1], primes_in_range[i]]
                min_diff = diff
        
        return closest_pair

s = Solution()

n = int(input("Enter the number of test cases: "))

for i in range(n):
    a, b = map(int, input("Enter 2 numbers separated by space: ").split())
    result = s.closestPrimes(a, b)
    print(f"Closest primes between {a} and {b}: {result}")