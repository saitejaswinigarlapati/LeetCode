import java.util.*;

class Solution_3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}

class LongestSubstringWithoutRepeatingCharacters_3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution_3 obj =new Solution_3();
        System.out.println("Number of test casses :");
        int n =sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n;i++){
            System.out.print("String : ");
            String s=sc.nextLine();
            System.out.printf("Length of longest substring : %d\n",obj.lengthOfLongestSubstring(s));
        }
    }
}