import java.util.*;

public class FindTheNumberOfWaysToPlacePeople1 {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int cnt = 0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            int y = points[i][1];
            int lower = -1;

            for (int j = i + 1; j < n; j++) {
                if (lower < points[j][1] && points[j][1] <= y) {
                    cnt++;
                    lower = points[j][1];
                }
                if (lower == y) break;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        FindTheNumberOfWaysToPlacePeople1 obj = new FindTheNumberOfWaysToPlacePeople1();

        int[][] points = {
            {1, 1},
            {2, 2},
            {3, 3}
        };

        int result = obj.numberOfPairs(points);

        System.out.println("Number of pairs: " + result);
    }
}



// Input: points = [[1,1],[2,2],[3,3]]
// Output: 0

// Input: points = [[6,2],[4,4],[2,6]]
// Output: 2

// Input: points = [[3,1],[1,3],[1,1]]
// Output: 2