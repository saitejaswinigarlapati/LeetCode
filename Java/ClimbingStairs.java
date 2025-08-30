public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;

        for (int i = 2; i < n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n - 1];
    }

    public static void main(String[] args) {
        int n = 2;
        ClimbingStairs obj = new ClimbingStairs();
        System.out.println("Distinct Ways : " + obj.climbStairs(n));
    }
}
