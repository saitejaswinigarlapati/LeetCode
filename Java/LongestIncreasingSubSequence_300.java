import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}

public class LongestIncreasingSubSequence_300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        for (int tc = 0; tc < t; tc++) {
            System.out.print("Enter elements of array separated by space: ");
            String[] input = sc.nextLine().split(" ");
            
            int[] nums = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                nums[i] = Integer.parseInt(input[i]);
            }

            Solution sol = new Solution();
            int lisLength = sol.lengthOfLIS(nums);

            System.out.println("Length of longest increasing subsequence: " + lisLength);
        }

        sc.close();
    }
}
