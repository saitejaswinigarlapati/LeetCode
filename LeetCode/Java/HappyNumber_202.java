import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber_202 {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (true) {
            if (n == 1) {
                return true;
            }
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Happy Number: ");
        int number = sc.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number!");
        } else {
            System.out.println(number + " is NOT a Happy Number.");
        }

        sc.close();
    }
}
