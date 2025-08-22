public class CountSubmatricesWithAllOnes {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] h = new int[n];
        int cnt = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                h[j] = mat[i][j] == 1 ? h[j] + 1 : 0;
            }

            for(int j=0; j<n; j++) {
                int mn = h[j];
                for(int k=j; k>=0 && mn>0; k--) {
                    mn = Math.min(mn, h[k]);
                    cnt += mn;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountSubmatricesWithAllOnes obj = new CountSubmatricesWithAllOnes();

        int[][] mat = {
            {1, 0, 1},
            {1, 1, 0},
            {1, 1, 0}
        };

        int result = obj.numSubmat(mat);
        System.out.println("Number of submatrices with all ones: " + result);
    }
}


// Input: mat = [[1,0,1],[1,1,0],[1,1,0]]
// Output: 13

// Input: mat = [[0,1,1,0],[0,1,1,1],[1,1,1,0]]
// Output: 24