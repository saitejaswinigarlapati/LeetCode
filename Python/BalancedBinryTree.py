from typing import Optional, List
from collections import deque

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        return self.checkHeight(root) != -1

    def checkHeight(self, node: Optional[TreeNode]) -> int:
        if node is None:
            return 0
        left = self.checkHeight(node.left)
        if left == -1:
            return -1
        right = self.checkHeight(node.right)
        if right == -1:
            return -1
        if abs(left - right) > 1:
            return -1
        return max(left, right) + 1


# Helper function to build tree from list
def buildTree(values: List[Optional[int]]) -> Optional[TreeNode]:
    if not values or values[0] is None:
        return None

    root = TreeNode(values[0])
    queue = deque([root])
    i = 1
    while queue and i < len(values):
        node = queue.popleft()
        if i < len(values) and values[i] is not None:
            node.left = TreeNode(values[i])
            queue.append(node.left)
        i += 1
        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])
            queue.append(node.right)
        i += 1
    return root


root_list = [3, 9, 20, None, None, 15, 7]
root = buildTree(root_list)

sol = Solution()
print("Is the tree balanced : ", sol.isBalanced(root))


# Input: root = [1,2,2,3,3,null,null,4,4]
# Output: false

# Input: root = []
# Output: true