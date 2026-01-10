from collections import deque
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root

def print_level_order(root: Optional[TreeNode]):
    if not root:
        print([])
        return
    
    result = []
    q = deque([root])

    while q:
        node = q.popleft()
        result.append(node.val)

        if node.left:
            q.append(node.left)
        if node.right:
            q.append(node.right)

    print(result)


s = Solution()

# Build tree
root = TreeNode(4,
        TreeNode(2, TreeNode(1), TreeNode(3)),
        TreeNode(7, TreeNode(6), TreeNode(9))
)

print_level_order(root)
inverted = s.invertTree(root)

print_level_order(inverted)
