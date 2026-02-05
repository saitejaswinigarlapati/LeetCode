import java.util.Scanner;

public class FindtheIndexofFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();

        FindtheIndexofFirstOccurrenceinaString finder = new FindtheIndexofFirstOccurrenceinaString();
        int index = finder.strStr(haystack, needle);

        if (index != -1) {
            System.out.println("The first occurrence is at index: " + index);
        } else {
            System.out.println("Needle not found in haystack.");
        }

    }
}


// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1