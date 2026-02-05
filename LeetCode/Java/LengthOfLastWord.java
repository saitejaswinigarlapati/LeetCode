public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of last word: " + lengthOfLastWord(s));
    }
}


// Input: s = "Hello World"
// Output: 5

// Input: s = "   fly me   to   the moon  "
// Output: 4

// Input: s = "luffy is still joyboy"
// Output: 6