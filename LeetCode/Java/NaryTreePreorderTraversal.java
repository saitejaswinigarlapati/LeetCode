import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NaryTreePreorderTraversal {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);

            List<Node> children = node.children;
            if (children != null) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NaryTreePreorderTraversal solution = new NaryTreePreorderTraversal();

        Node node5 = new Node(5, new ArrayList<>());
        Node node6 = new Node(6, new ArrayList<>());

        List<Node> children3 = new ArrayList<>();
        children3.add(node5);
        children3.add(node6);
        Node node3 = new Node(3, children3);

        Node node2 = new Node(2, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());

        List<Node> children1 = new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        Node root = new Node(1, children1);

        List<Integer> result = solution.preorder(root);
        System.out.println(result);
    }
}
