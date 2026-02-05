public class TrappingRainWater_42 {
    public int trap(int [] height){
        int l=0,r=height.length-1,l_max=0,r_max=0,total=0;

        while( l <= r){
            if( height[l] <= height[r]){
                if (height[l] >= l_max){
                    l_max=height[l];
                }else{
                    total+=l_max - height[l];
                }
                l++;
            }
            else{
                if (height[r] >= r_max){
                    r_max=height[r];
                }else{
                    total+=r_max-height[r];
                }
            r--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater_42 obj = new TrappingRainWater_42();
        System.out.println("Water it can trap: "+ obj.trap(height));

    }
}
