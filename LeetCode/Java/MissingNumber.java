public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int nums_sum = 0;
        for (int num : nums) {
            nums_sum += num;
        }
        int actual_sum = (n*(n+1))/2;
        return actual_sum - nums_sum;
    }
    public static void main(String[] args) {
        MissingNumber obj=new MissingNumber();
        int[] nums ={0,1,2,3,5,6,7};
        System.out.println("Missing number : " + obj.missingNumber(nums));
    }
}


// Input: nums = [3,0,1]
// Output: 2

// Input: nums = [0,1]
// Output: 2

// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8