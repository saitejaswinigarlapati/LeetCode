import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
        int start = 0,end = 0;
        int n = fruits.length,maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(end<n)
        {
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>=3)
            {
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0) map.remove(fruits[start]);
                start++;
            }
            int currLen = end-start+1;
            maxLen = Math.max(maxLen,currLen);
            end++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();

        int[] fruits = new int[n];

        System.out.print("Fruit  : ");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        FruitIntoBasket solution = new FruitIntoBasket();
        int result = solution.totalFruit(fruits);

        System.out.println("Maximum  fruits : " + result);

    }
}

// Input: fruits = [1,2,1]
// Output: 3

// Input: fruits = [0,1,2,2]
// Output: 3

// Input: fruits = [1,2,3,2,2]
// Output: 4