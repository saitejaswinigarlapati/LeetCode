import java.util.*;

public class IntersectionOfTwoArrays2_305  {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for efficiency
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of elements in nums1
        for (int num : nums1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Find intersection
        for (int num : nums2) {
            if (count.getOrDefault(num, 0) > 0) {
                result.add(num);
                count.put(num, count.get(num) - 1);
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays2_305 s = new IntersectionOfTwoArrays2_305();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(s.intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(s.intersect(nums3, nums4)));
    }
}
