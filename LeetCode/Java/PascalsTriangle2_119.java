import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row =new ArrayList<>();
        row.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> nextRow =new ArrayList<>();
            nextRow.add(1);
            for(int j=1;j<row.size();j++){
                nextRow.add(row.get(j-1)+row.get(j));
            }
            nextRow.add(1);
            row=nextRow;
        }
        return row;
        
    }
}
public class PascalsTriangle2_119 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter number of test cases: ");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Number of rows : ");
            int r =sc.nextInt();
            sc.nextLine();
            List<Integer> result = sol.getRow(r);
            System.out.println(result);
        }
    }
}

