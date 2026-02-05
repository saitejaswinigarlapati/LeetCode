import java.util.*;
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length -1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseWordsinaString obj=new ReverseWordsinaString();
        System.out.print("String : ");
        String s=sc.nextLine();
        System.out.print("Reversed string : " +obj.reverseWords(s) );
    }
}


// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Input: s = "  hello world  "
// Output: "world hello"