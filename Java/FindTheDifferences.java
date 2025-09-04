import java.util.HashMap;

public class FindTheDifferences {
    static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!count.containsKey(c) || count.get(c) == 0) {
                return c;
            }
            count.put(c, count.get(c) - 1);
        }
        
        return ' ';
    }
    public static void main(String[] args) {
        String s="abcd",t="abcde";
        System.out.println(findTheDifference(s, t)+" is the letter added");
    }
}


// Input: s = "abcd", t = "abcde"
// Output: "e"
// Input: s = "", t = "y"
// Output: "y"