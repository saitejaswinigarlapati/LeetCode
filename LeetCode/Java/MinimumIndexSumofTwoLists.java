import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);

                if (sum < minSum) {
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                } 
                else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        MinimumIndexSumofTwoLists s = new MinimumIndexSumofTwoLists();

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        System.out.println(Arrays.toString(s.findRestaurant(list1, list2)));
    }
}
