
import java.util.Arrays;
import java.util.Scanner;
public class MaxAverageSubarray_643{
    public double maxaverage(int[] nums,int k){
        double res=Arrays.stream(nums,0,k).sum();
        double maxsum=res;
        for(int i=k;i<nums.length;i++){
            res=res+nums[i]-nums[i-k];
            maxsum=Math.max(res,maxsum);
        }
        return maxsum/k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MaxAverageSubarray_643 obj =new MaxAverageSubarray_643();
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
            System.out.println("k :");
            int k=sc.nextInt();
            sc.nextLine();
            System.out.println(obj.maxaverage(array, k));
        }
        sc.close();
    }
}