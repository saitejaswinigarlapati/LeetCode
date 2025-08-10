from typing import Optional,List
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children


class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        if root is None:
            return []
        stack=[root]
        ls=[]
        while stack:
            temp=stack.pop()
            ls.append(temp.val)
            stack.extend(temp.children[::-1])
        return ls
    
s=Solution()

node5 = Node(5, [])
node6 = Node(6, [])

node3 = Node(3, [node5, node6])

node2 = Node(2, [])
node4 = Node(4, [])

root = Node(1, [node3, node2, node4])

print(s.preorder(root))

