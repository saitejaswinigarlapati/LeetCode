import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations_46 {
    public void backTrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {
            if (temp.contains(num)) continue;

            temp.add(num);
            backTrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    public static void main(String[] args) {
        Permutations_46 obj = new Permutations_46();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements with space separation: ");
            String[] input = sc.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }
            System.out.println(obj.permute(array));
        }
    }
}
