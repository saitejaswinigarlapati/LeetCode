import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]%2==0){
                l++;
            }else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r--;
            }
        }
        return nums;
    }
}

public class SortArrayByParity_905{
    public static void main(String[] args) {
        Solution obj=new Solution();

        int[] nums={3,1,2,4};
        int[] result = obj.sortArrayByParity(nums);
        System.out.println("Array satisfies the given condition: " + Arrays.toString(result));
    }
}

