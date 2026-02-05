import java.util.Scanner;

public class StringToInteger_8 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int i = 0, sign = 1, result = 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return sign * result;
    }

    public static void main(String[] args) {
        StringToInteger_8 sol = new StringToInteger_8(); // Change here
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of testcases: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            String str = sc.nextLine();
            System.out.println("Int: " + sol.myAtoi(str));
        }
        sc.close();
    }
}
