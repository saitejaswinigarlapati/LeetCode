import java.util.Arrays;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }

        return i;
    }

    public static void main(String[] args) {
        AssignCookies obj = new AssignCookies();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(obj.findContentChildren(g, s));  // Output: 1
    }
}
