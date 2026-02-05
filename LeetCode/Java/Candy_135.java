import java.util.Arrays;
import java.util.Scanner;
public class Candy_135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies=new int[n];
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                    candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                candies[i-1]=Math.max(candies[i]+1,candies[i-1]);
            }
        }
        return Arrays.stream(candies).sum();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ratings : ");
        String[] input =sc.nextLine().split(" ");
        int[] nums= new int[input.length];
        for(int i=0;i<input.length;i++){
                nums[i]=Integer.parseInt(input[i]);
        }

        Candy_135 obj=new Candy_135();
        int res=obj.candy(nums);
        System.out.print("Mininum number of candies : " + res);
    }
}