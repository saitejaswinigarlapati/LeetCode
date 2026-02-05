import java.util.Arrays;

public class LongeestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        String firstElement = strs[0];
        String lastElement = strs[strs.length - 1];
        StringBuilder longestPrefix = new StringBuilder();

        int minLength = Math.min(firstElement.length(), lastElement.length());
        for (int i = 0; i < minLength; i++) {
            if (firstElement.charAt(i) != lastElement.charAt(i)) {
                break;
            }
            longestPrefix.append(firstElement.charAt(i));
        }

        return longestPrefix.toString();
    }
     public static void main(String[] args) {
        LongeestCommonPrefix sol = new LongeestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + sol.longestCommonPrefix(strs));
    }
}


// Input :strs = ["flower","flow","flight"]
// Output: "fl"

// Input: strs = ["dog","racecar","car"]
// Output: ""