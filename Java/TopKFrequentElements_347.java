import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> dic = new HashMap<>();
        for (int num : nums) {
            dic.put(num, dic.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sorted_ls = new ArrayList<>(dic.entrySet());
        sorted_ls.sort((a, b) -> b.getValue() - a.getValue());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sorted_ls.get(i).getKey();
        }
        return res;
    }
}

public class TopKFrequentElements_347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
