import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if (prices[i] > prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}

public class BestTimeToBuyAndSellStock2_122{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();
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
// Output: 7

// Input: prices = [1,2,3,4,5]
// Output: 4

// Input: prices = [7,6,4,3,1]
// Output: 0

