import java.util.*;

class Solution13 {
    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;
        HashMap<Character, Integer> d = new HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = d.get(s.charAt(i));
            if (current < previous) {
                result -= current;
            } else {
                result += current;
            }
            previous = current;
        }
        return result;
    }
}

class RomanToInteger_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution13 rnum = new Solution13();
        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a Roman number: ");
            String a = sc.nextLine();
            System.out.printf("Numeric value of %s: %d%n", a, rnum.romanToInt(a));
        }
        sc.close();
    }
}
