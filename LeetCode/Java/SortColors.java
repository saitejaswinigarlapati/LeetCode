import java.util.Arrays;
public class SortColors {
    static void sortColors(int[] nums) {
        int start = 0, middle = 0, end = nums.length - 1;

        while (middle <= end) {
            switch (nums[middle]) {
                case 0:
                    int temp0 = nums[start];
                    nums[start] = nums[middle];
                    nums[middle] = temp0;
                    start++;
                    middle++;
                    break;

                case 1:
                    middle++;
                    break;

                case 2:
                    int temp2 = nums[middle];
                    nums[middle] = nums[end];
                    nums[end] = temp2;
                    end--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}


// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Input: nums = [2,0,1]
// Output: [0,1,2]