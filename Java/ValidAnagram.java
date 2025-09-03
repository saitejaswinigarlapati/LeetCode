import java.util.Arrays;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char ch1[] =s.toCharArray();
        char ch2[] =t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1=new String(ch1);
        String t1=new String(ch2);
        return s1.equals(t1);
    }
    public static void main(String[] args) {
        ValidAnagram obj=new ValidAnagram();
        String s="anagram";
        String t = "nagaram";
        System.out.println("Anagrams : "+obj.isAnagram(s, t));

    }
}


// Input: s = "anagram", t = "nagaram"
// Output: true

// Input: s = "rat", t = "car"
// Output: false