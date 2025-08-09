import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();

        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int r : rows){
            for(int j=0;j<n;j++){
                matrix[r][j]=0;
            }
        }
        for(int c: cols){
            for(int i=0;i<m;i++){
                matrix[i][c]=0;
            }
        }
    }
    public static void main(String[] args) {
        SetMatrixZeroes obj=new SetMatrixZeroes();

        int[][] matrix = {
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1}
                    };

        System.out.println("Before: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        obj.setZeroes(matrix);
        
        System.out.println("After: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}