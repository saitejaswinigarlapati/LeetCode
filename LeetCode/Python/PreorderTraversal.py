from typing import List,Optional
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res=[]
        def preorder(node):
            if not node:
                return
            res.append(node.val)
            preorder(node.left)
            preorder(node.right)
        preorder(root)
        return res
    
root = TreeNode(1)
root.right = TreeNode(2)
root.right.left = TreeNode(3)

sol = Solution()
print(sol.preorderTraversal(root))


# Input: root = [1,null,2,3]
# Output: [1,2,3]

# Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
# Output: [1,2,4,5,6,7,3,8,9]