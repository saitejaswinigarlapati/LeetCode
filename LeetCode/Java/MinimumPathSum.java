public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m - 1][n - 1];
    }
    public static void main(String[] args) {
        MinimumPathSum s = new MinimumPathSum();

        int[][] grid1 = { {1, 3, 1}, {1, 5, 1}, {4, 2, 1} };
        System.out.println("Output: " + s.minPathSum(grid1)); 
    
    }
}


// Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
// Output: 7

// Input: grid = [[1,2,3],[4,5,6]]
// Output: 12