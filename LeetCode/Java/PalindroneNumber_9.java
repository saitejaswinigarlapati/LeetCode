import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String rstr = new StringBuilder(str).reverse().toString();
        return str.equals(rstr);
    }
}

public class PalindroneNumber_9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbet of teest cases: ");
        int n= sc.nextInt();
        for(int i=0; i < n;i++){
            System.out.println("Enter a number: ");
            int a=sc.nextInt();
            boolean result = s.isPalindrome(a);
            System.out.printf("%d is palindrome : %b\n",a,result);
        }
        }
    }
