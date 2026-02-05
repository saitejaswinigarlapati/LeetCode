import java.util.Scanner;
class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        Solution_35 s = new Solution_35();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements with space separation: ");
            sc.nextLine();
            String[] input = sc.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }
            System.out.print("Target: ");
            int target = sc.nextInt();
            System.out.println(s.searchInsert(array, target));
        }
        sc.close();
    }
}