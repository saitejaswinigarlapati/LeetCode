import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (seen.containsKey(val) && i - seen.get(val) <= k) {
                return true;
            }
            seen.put(val, i);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k (distance): ");
        int k = sc.nextInt();

        ContainsDuplicate2 obj = new ContainsDuplicate2();
        boolean result = obj.containsNearbyDuplicate(nums, k);

        if (result) {
            System.out.println("Duplicate within distance " + k + " exists.");
        } else {
            System.out.println("No duplicate within distance " + k + ".");
        }

        sc.close();
    }
}
