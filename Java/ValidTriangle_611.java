import java.util.Arrays;

public class ValidTriangle_611 {
    public int triangleNumber(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=n-1;i>-1;i--){
            int left=0,right=i-1;
            while (left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=right-left;
                    right-=1;
                }else{
                    left+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ValidTriangle_611 obj=new ValidTriangle_611();
        int[] nums = {4,2,3,4};
        System.out.println("Number of Valid combinations are: "+obj.triangleNumber(nums));

    }
}


// Input: nums = [2,2,3,4]
// Output: 3

// Input: nums = [4,2,3,4]
// Output: 4