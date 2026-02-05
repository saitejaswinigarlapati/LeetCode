import java.util.ArrayList;
import java.util.List;
//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreePaths_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        //Append the current node's value to the path.
        path += node.val;

        //If it's a leaf node, add the path to the result list.
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";// Separate nodes in the path.
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);


        BinaryTreePaths_257 obj=new BinaryTreePaths_257();
    List<String> paths = obj.binaryTreePaths(root);

    // Print the result
    System.out.println(paths);
        
    }
}