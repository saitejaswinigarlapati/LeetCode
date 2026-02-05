import java.util.*;

public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        class Solution {
        public int maxProfit(int[] prices) {
            int buy_price=prices[0];
            int maxProfit=0;
            for(int i: prices){
                buy_price=Math.min(i,buy_price);
                maxProfit=Math.max(maxProfit,i-buy_price); 
            }
            return maxProfit;
        }
    }

    Scanner sc=new Scanner(System.in);
    Solution sol =new Solution();
    System.out.print("Stock prices : ");
    String[] input = sc.nextLine().split(" ");
            int[] nums = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                nums[i] = Integer.parseInt(input[i]);
            }
    
    System.out.printf("Max Profit : %d" , sol.maxProfit(nums));
    }
}

// Input: prices = [7,1,5,3,6,4]
// Output: 5

// Input: prices = [7,6,4,3,1]
// Output: 0