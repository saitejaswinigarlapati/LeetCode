import java.util.Scanner;

class Solution_43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = digit1 * digit2 + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder product = new StringBuilder();
        for (int num : result) {
            if (!(product.length() == 0 && num == 0)) {
                product.append(num);
            }
        }

        return product.toString();
    }
}

public class MultiplyStrings_43 {
    public static void main(String[] args) {
        Solution_43 obj = new Solution_43();
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("num1: ");
            String num1 = sc.nextLine();
            System.out.println("num2: ");
            String num2 = sc.nextLine();

            String result = obj.multiply(num1, num2);
            System.out.println("Result: " + result);
        }

    }
}
