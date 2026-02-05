from typing import List, Optional
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return None
        mid = len(nums) // 2
        return TreeNode(
            nums[mid],
            self.sortedArrayToBST(nums[:mid]),
            self.sortedArrayToBST(nums[mid + 1:])
        )

    def bstToLevelOrderList(self, root: Optional[TreeNode]) -> List[Optional[int]]:
        if not root:
            return []

        result = []
        queue = deque([root])

        while queue:
            node = queue.popleft()
            if node:
                result.append(node.val)
                queue.append(node.left)
                queue.append(node.right)
            else:
                result.append(None)

        while result and result[-1] is None:
            result.pop()

        return result

s = Solution()
nums = list(map(int, input("Enter sorted list: ").split()))
root = s.sortedArrayToBST(nums)
output = s.bstToLevelOrderList(root)
print(output)
