import java.util.Scanner;

class Solution_136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

class SingleNumber_136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution_136 obj = new Solution_136();

        System.out.println("Enter number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements with space separation: ");
            String[] input = sc.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }

            int result = obj.singleNumber(array);
            System.out.printf("Unique Number : %d%n", result);
        }

        sc.close();
    }
}
