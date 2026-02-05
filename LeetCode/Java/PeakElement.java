import java.util.Scanner;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nums : ");
        String[] input=sc.nextLine().split(" ");
        int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }
            PeakElement obj = new PeakElement();
        int peakIndex = obj.findPeakElement(array);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + array[peakIndex]);
    }
}