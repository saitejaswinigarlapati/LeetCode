from typing import Optional, List
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def helper(node):
            if not node:
                return 0, 0

            left_height, left_diameter = helper(node.left)
            right_height, right_diameter = helper(node.right)

            diameter_through_root = left_height + right_height

            diameter = max(diameter_through_root, left_diameter, right_diameter)

            current_height = 1 + max(left_height, right_height)

            return current_height, diameter

        return helper(root)[1]

def build_tree(values: List[Optional[int]]) -> Optional[TreeNode]:
    if not values:
        return None
    root = TreeNode(values[0])
    queue = deque([root])
    i = 1
    while queue and i < len(values):
        node = queue.popleft()
        if values[i] is not None:
            node.left = TreeNode(values[i])
            queue.append(node.left)
        i += 1
        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])
            queue.append(node.right)
        i += 1
    return root

values = [1, 2, 3, 4, 5]
root = build_tree(values)

solution = Solution()
print("Diameter:", solution.diameterOfBinaryTree(root))
