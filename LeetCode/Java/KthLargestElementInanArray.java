import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementInanArray {
    public int findKthLargest(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num : nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        int[] count = new int[maxValue - minValue + 1];
        for (int num : nums) {
            count[num - minValue]++;
        }

        int remaining = k;
        for (int i = count.length - 1; i >= 0; i--) {
            remaining -= count[i];
            if (remaining <= 0) {
                return i + minValue;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KthLargestElementInanArray s = new KthLargestElementInanArray();

        System.out.print("Array elements : ");
        String[] input = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.print("k : ");
        int k = sc.nextInt();

        int result = s.findKthLargest(nums, k);
        System.out.println(k + "th largest element in " + Arrays.toString(nums) + " : " + result);
    }
}
