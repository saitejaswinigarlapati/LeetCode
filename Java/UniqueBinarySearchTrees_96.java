public class UniqueBinarySearchTrees_96 {

    public int numTrees(int n) {
        int[] uniqTree = new int[n + 1];

        uniqTree[0] = 1;
        uniqTree[1] = 1;

        for (int nodes = 2; nodes <= n; nodes++) {
            int total = 0;
            for (int root = 1; root <= nodes; root++) {
                total += uniqTree[root - 1] * uniqTree[nodes - root];
            }
            uniqTree[nodes] = total;
        }

        return uniqTree[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees_96 solution = new UniqueBinarySearchTrees_96();

        int n = 3;
        int result = solution.numTrees(n);

        System.out.println(result);
    }
}
