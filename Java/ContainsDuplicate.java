import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
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

        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.containsDuplicate(nums);

        if (result) {
            System.out.println("Duplicate exists.");
        } else {
            System.out.println("All elements are unique.");
        }

    }
}
