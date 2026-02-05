import java.util.*;

public class MinimumNumberOfPeopleToTeach {

    public int minimumTeachings(int n, List<List<Integer>> languages, int[][] friendships) {
        Set<Integer> need = new HashSet<>();

        for (int[] f : friendships) {
            int u = f[0] - 1;
            int v = f[1] - 1;
            boolean ok = false;

            for (int langU : languages.get(u)) {
                if (languages.get(v).contains(langU)) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                need.add(u);
                need.add(v);
            }
        }

        int ans = languages.size() + 1;

        for (int i = 1; i <= n; i++) {
            int cans = 0;
            for (int v : need) {
                if (!languages.get(v).contains(i)) {
                    cans++;
                }
            }
            ans = Math.min(ans, cans);
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumNumberOfPeopleToTeach s = new MinimumNumberOfPeopleToTeach();

        int n = 2;
        List<List<Integer>> languages = new ArrayList<>();
        languages.add(Arrays.asList(1));
        languages.add(Arrays.asList(2));
        languages.add(Arrays.asList(1, 2));

        int[][] friendships = {{1, 2}, {1, 3}, {2, 3}};

        System.out.println("Minimum Teachings : " + 
            s.minimumTeachings(n, languages, friendships));
    }
}
