import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                int aboveLeft = j == i ? triangle.get(i - 1).get(j - 1) : triangle.get(i - 1).get(j);
                int aboveRight = j > 0 ? triangle.get(i - 1).get(j - 1) : triangle.get(i - 1).get(j);
                int min = Math.min(aboveLeft, aboveRight);
                triangle.get(i).set(j, triangle.get(i).get(j) + min);
            }
        }

        return Collections.min(triangle.get(triangle.size() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle_120 sol = new Triangle_120();
        List<List<Integer>> triangle = new ArrayList<>();

        System.out.print("Enter number of rows in the triangle: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " numbers for row " + (i + 1) + ", separated by space: ");
            String[] parts = scanner.nextLine().split(" ");
            if (parts.length != i + 1) {
                System.out.println("Invalid row length. Try again.");
                return;
            }
            List<Integer> row = new ArrayList<>();
            for (String part : parts) {
                row.add(Integer.parseInt(part));
            }
            triangle.add(row);
        }

        System.out.println("\nTriangle entered:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

        int result = sol.minimumTotal(triangle);
        System.out.println("\nMinimum Total Path Sum: " + result);
    }
}
