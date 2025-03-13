import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes_283{
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] !=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        MoveZeroes_283 obj=new MoveZeroes_283();
        Scanner sc=new Scanner(System.in);
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
            obj.moveZeroes(array);
            System.out.println("Array after moving zeroes: " + Arrays.toString(array));
        }
        sc.close();
    }
}