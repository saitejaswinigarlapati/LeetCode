import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =new ArrayList<>();
        if(numRows ==0 ) return result;
        List <Integer> firstRow =new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows==1) return result;
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);
            ArrayList<Integer> row =new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }row.add(1);
            result.add(row);
        }
        return result;
    }
}
public class PascalsTriangle_118 {

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
            List<List<Integer>> triangle = sol.generate(r);
            for (List<Integer> row : triangle) {
            System.out.println(row);
        }
        }
    }
}
