import java.util.Scanner;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining nums2 elements if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        for (int tc = 0; tc < t; tc++) {
            System.out.print("Enter elements of array 1 (including extra 0s) separated by space: ");
            String[] input = sc.nextLine().split(" ");
            int[] nums1 = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                nums1[i] = Integer.parseInt(input[i]);
            }

            System.out.print("Enter elements of array 2 separated by space: ");
            String[] input2 = sc.nextLine().split(" ");
            int[] nums2 = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                nums2[i] = Integer.parseInt(input2[i]);
            }

            int m = nums1.length - nums2.length; // number of real elements in nums1
            int n = nums2.length;

            Solution sol = new Solution();
            sol.merge(nums1, m, nums2, n);

            System.out.print("Merged array: ");
            for (int num : nums1) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
