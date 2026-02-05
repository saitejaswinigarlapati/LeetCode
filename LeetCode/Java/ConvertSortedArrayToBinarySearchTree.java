import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }

    private TreeNode convert(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = convert(nums, left, mid - 1);
        node.right = convert(nums, mid + 1, right);

        return node;
    }
}

public class ConvertSortedArrayToBinarySearchTree {
    public static List<Integer> serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null) {
                result.add(node.val);
                q.add(node.left);
                q.add(node.right);
            } else {
                result.add(null);
            }
        }

        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = s.sortedArrayToBST(nums);
        System.out.println("Serialized Tree: " + serialize(root));
    }
}
