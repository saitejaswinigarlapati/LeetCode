from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        leftdepth=self.minDepth(root.left)
        rightdepth=self.minDepth(root.right)

        if root.left is None and root.right is None:
            return 1
        if root.left is None:
            return 1+rightdepth
        if root.right is None:
            return 1+leftdepth

        return min(leftdepth,rightdepth) +1
    
root = TreeNode(3)
root.left = TreeNode(9)
root.right = TreeNode(20)
root.right.left = TreeNode(15)
root.right.right = TreeNode(7)

s = Solution()
print(s.minDepth(root))

# Input: root = [3,9,20,null,null,15,7]
# Output: 2

# Input: root = [2,null,3,null,4,null,5,null,6]
# Output: 5