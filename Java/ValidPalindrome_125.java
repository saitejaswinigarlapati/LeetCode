import java.util.*;

class Solution_125 {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String x=new StringBuilder(s).reverse().toString();
        return (x.equals(s)) ? true : false;
        
    }
}

class ValidPalindrome_125{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution_125 obj =new Solution_125();
        System.out.println("Number of test cases : ");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n ;i++){
            System.out.println("String : ");
            String s =sc.nextLine();
            System.out.println(obj.isPalindrome(s));
        }
    }
}