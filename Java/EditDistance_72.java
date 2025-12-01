class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] table = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            table[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            table[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    int delete = table[i - 1][j] + 1;
                    int insert = table[i][j - 1] + 1;
                    int substitute = table[i - 1][j - 1] + 1;
                    table[i][j] = Math.min(delete, Math.min(insert, substitute));
                }
            }
        }

        return table[m][n];
    }
}

public class EditDistance_72 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        String word1_1 = "horse";
        String word2_1 = "ros";
        int dist1 = sol.minDistance(word1_1, word2_1);
        System.out.println("The minimum edit distance between \"" + word1_1 + "\" and \"" + word2_1 + "\" is: " + dist1);

    
    }
}
