class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        MaxDepthofBinaryTree sol = new MaxDepthofBinaryTree();
        int depth = sol.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth); 
    }
}

// Input: root = [3,9,20,null,null,15,7]
// Output: 3

// Input: root = [1,null,2]
// Output: 2