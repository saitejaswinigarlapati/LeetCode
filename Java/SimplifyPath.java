import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String i : s) {
            if (i.equals("") || i.equals(".")) {
                continue;
            } else if (i.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(i);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }

        return result.length() > 0 ? result.toString() : "/";
    }
    public static void main(String[] args){
        SimplifyPath obj=new SimplifyPath();
        String s="/home/";
        System.out.print(obj.simplifyPath(s));

    }
}

// Input: path = "/home/"
// Output: "/home"


// Input: path = "/home//foo/"
// Output: "/home/foo"

// Input: path = "/home/user/Documents/../Pictures"
// Output: "/home/user/Pictures"
