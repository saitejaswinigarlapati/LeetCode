import java.util.*;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int r=0;
        int l=0;
        while (l<s.length() && r<t.length()){
            if(s.charAt(l) == t.charAt(r)){
                l++;
            }
            r++;
        }
        return l==s.length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IsSubsequence obj=new IsSubsequence();
        System.out.print("s : ");
        String s=sc.nextLine();
        System.out.print("t : ");
        String t=sc.nextLine();
        System.out.println("Is Subsequence : " + obj.isSubsequence(s, t));

    }
}