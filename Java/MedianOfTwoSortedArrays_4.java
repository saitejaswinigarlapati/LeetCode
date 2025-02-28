import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Solution_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[] =IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
        int l =nums.length;
        Arrays.sort(nums);
        return (l%2==0) ? (nums[l/2] + nums[(l/2)-1])/2.0 : nums[l/2] ;
    }
}

class MedianOfTwoSortedArrays_4{
    public static void main(String [] args){
        Solution_4 obj =new Solution_4();
        Scanner sc=new Scanner(System.in);

        System.out.print("Number of Test cases: ");
        int n =sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of 2 arrays: ");
            int m = sc.nextInt();
            int n1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the elements of 1st array: ");
            int[] nums1 = new int[m];
            for (int j = 0; j < m; j++) {
                nums1[j] = sc.nextInt();
            }
            sc.nextLine();

            System.out.println("Enter the elements of 2nd array: ");
            int[] nums2 = new int[n1];
            for (int j = 0; j < n1; j++) {
                nums2[j] = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Median of 2 sorted arrays: " + obj.findMedianSortedArrays(nums1, nums2));
        }
    }
}