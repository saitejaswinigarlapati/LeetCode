## Hacker Rank

import heapq

def cookies(k, A):
    heapq.heapify(A)  # convert list to min heap
    operations = 0

    while len(A) > 1:
        # Check smallest element
        if A[0] >= k:
            return operations

        first = heapq.heappop(A)   # least sweet
        second = heapq.heappop(A)  # second least sweet

        new_cookie = first + 2 * second
        heapq.heappush(A, new_cookie)

        operations += 1

    # Final check
    if A and A[0] >= k:
        return operations
    else:
        return -1


# -------- Example Usage --------
k = 7
A = [1, 2, 3, 9, 10, 12]

result = cookies(k, A)
print(result)