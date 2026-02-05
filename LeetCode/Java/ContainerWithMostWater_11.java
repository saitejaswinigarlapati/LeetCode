import java.util.Scanner;

public class ContainerWithMostWater_11{
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            max_area=Math.max(max_area,area);
            if (height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        ContainerWithMostWater_11 obj=new ContainerWithMostWater_11();
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
            
            System.out.println("Maxinum amount of water : " + obj.maxArea(array));
        }
        sc.close();
    }
}