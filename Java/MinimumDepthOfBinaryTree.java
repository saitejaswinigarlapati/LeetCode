class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + rightDepth;
        }
        if (root.right == null) {
            return 1 + leftDepth;
        }

        return 1 + Math.min(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        // Constructing the tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MinimumDepthOfBinaryTree sol = new MinimumDepthOfBinaryTree();
        System.out.println(sol.minDepth(root)); // Output should be 2
    }
}


// Input: root = [3,9,20,null,null,15,7]
// Output: 2

// Input: root = [2,null,3,null,4,null,5,null,6]
// Output: 5