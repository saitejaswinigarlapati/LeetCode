import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        Map<Character,Character> mapping=new HashMap<>();

        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');

        for (char ch : s.toCharArray()){
            if(mapping.containsKey(ch)){
                char top = stack.isEmpty() ? '#' : stack.pop();
                if(top !=mapping.get(ch)){
                    return false;
                }
            }
                else{
                    stack.push(ch);
                }
            }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ValidParentheses obj=new ValidParentheses();
        System.out.print("Enter a string : ");
        String sr=sc.nextLine();
        System.out.print("Valid parentheses : "+ obj.isValid(sr));
    }
}