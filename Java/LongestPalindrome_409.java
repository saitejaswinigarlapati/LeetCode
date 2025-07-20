import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int length = 0;
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int count : freq.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
            }
        }
        return length < s.length() ? length + 1 : length;
    }
}

public class LongestPalindrome_409 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();
        System.out.println("String");
        String s =sc.nextLine();
        System.out.print(sol.longestPalindrome(s));
    }
}
