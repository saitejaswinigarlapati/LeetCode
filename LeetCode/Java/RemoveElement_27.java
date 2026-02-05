import java.util.Scanner;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                count++;
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        RemoveElement_27 obj=new RemoveElement_27();
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter nums elements with space separation: ");
            String[] input = sc.nextLine().split(" ");
            int[] nums = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                nums[j] = Integer.parseInt(input[j]);
            }
            System.out.println("Value : ");
            int val=sc.nextInt();
            sc.nextLine();
            System.out.println(obj.removeElement(nums, val));
            }
        
        sc.close();
    }
}

