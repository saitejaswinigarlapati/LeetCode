// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor for single value node
    TreeNode(int val) {
        this.val = val;
    }

    // Constructor with children
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Main solution class
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the tree is empty
        if (root == null) {
            return false;
        }

        // If it's a leaf node, check if the remaining sum equals this node's value
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }

        // Recurse down the left and right subtrees with the reduced target sum
        targetSum -= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

// Main class to test the solution
public class PathSum_112 {
    public static void main(String[] args) {
        // Construct the binary tree
        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           / \       \
          7   2       1
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        // Create solution object
        Solution sol = new Solution();
        int targetSum = 22;

        // Check and print result
        System.out.println("Has Path Sum = " + sol.hasPathSum(root, targetSum));
        // Expected Output: true
    }
}
