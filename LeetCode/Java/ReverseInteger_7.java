import java.util.*;
class Solution7 {
    public int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        StringBuilder s = new StringBuilder(String.valueOf(x));
        int rev = 0;
        try {
            rev = Integer.parseInt(s.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        rev *= sign;
        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
            return rev;
        }
        return 0;
    }
}

class ReverseInteger_7{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution7 s=new Solution7();
        System.out.println("Enter number of test cases : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<n ;i++){
            System.out.println("Enter a number : ");
            int a=sc.nextInt();
            System.out.printf("Reversed Number : %d%n",s.reverse(a));
        }
    }
}
