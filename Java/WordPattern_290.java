import java.util.HashMap;

public class WordPattern_290 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<String, String> seen = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            String keyP = "p_" + p; // key for pattern character
            String keyW = "w_" + w; // key for word

            if (seen.containsKey(keyP) && !seen.get(keyP).equals(w)) {
                return false;
            }
            if (seen.containsKey(keyW) && !seen.get(keyW).equals(String.valueOf(p))) {
                return false;
            }

            seen.put(keyP, w);
            seen.put(keyW, String.valueOf(p));
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern_290 obj = new WordPattern_290();

        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println("Bijection can establish: " + obj.wordPattern(pattern, s));
    }
}
