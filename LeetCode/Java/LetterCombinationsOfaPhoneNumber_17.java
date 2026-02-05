import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LetterCombinationsOfaPhoneNumber_17{
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<Character, String> d = new HashMap<>();
        d.put('2', "abc"); d.put('3', "def"); d.put('4', "ghi"); d.put('5', "jkl");
        d.put('6', "mno"); d.put('7', "pqrs"); d.put('8', "tuv"); d.put('9', "wxyz");

        List<String> l = new ArrayList<>();
        l.add("");

        for (char digit : digits.toCharArray()) {
            List<String> s = new ArrayList<>();
            for (String i : l) {
                for (char c : d.get(digit).toCharArray()) {
                    s.add(i + c);
                }
            }
            l = s;
        }

        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LetterCombinationsOfaPhoneNumber_17 obj=new LetterCombinationsOfaPhoneNumber_17();
        System.out.println("Number of testcases : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter digits for test case " + (i + 1) + ": ");
            String digits = sc.nextLine();
            List<String> result = obj.letterCombinations(digits);
            System.out.println("Possible Combinations: " + result);
        }

    }
}


