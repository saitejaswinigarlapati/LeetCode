import java.util.Arrays;
public class NextGreaterElement{
    public int[] nextgreaterelement(int[] nums1,int[] nums2){
        int[] ans=new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            int startindex=-1;
            for(int k=0;k<nums2.length;k++){
                if(nums2[k]==nums1[i]){
                    startindex=k;
                    break;
                }
            }
            for(int j=startindex;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        NextGreaterElement sol=new NextGreaterElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = sol.nextgreaterelement(nums1, nums2);
        System.out.println(Arrays.toString(result));

    }
}