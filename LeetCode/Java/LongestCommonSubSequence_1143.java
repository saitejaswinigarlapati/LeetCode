import java.util.Scanner;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int  dp[][] =new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
public class LongestCommonSubSequence_1143 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("S1: ");
            String s1=sc.nextLine();
            System.out.print("S2: ");
            String s2=sc.nextLine();
            System.out.println("Length of Longest common subsequence : "+sol.longestCommonSubsequence(s1, s2) );
        }
    }
}
