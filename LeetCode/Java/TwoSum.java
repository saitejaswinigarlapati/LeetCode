import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> pair_index = new HashMap<>();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pair_index.containsKey(target - num)) {
                int[] result = {i, pair_index.get(target - num)};
                System.out.println(Arrays.toString(result));
                return;
            }
            pair_index.put(num, i);
        }

        System.out.println("No pair found");
    }
}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Input: nums = [3,3], target = 6
// Output: [0,1]