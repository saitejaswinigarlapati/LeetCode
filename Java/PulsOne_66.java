import java.util.Arrays;
import java.util.Scanner;

public class PulsOne_66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        PulsOne_66 obj = new PulsOne_66();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements with space separation: ");
            String[] input = sc.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }
            System.out.println(Arrays.toString(obj.plusOne(array)));
        }

    }
}
