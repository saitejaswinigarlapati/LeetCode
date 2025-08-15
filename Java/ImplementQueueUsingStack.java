import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public ImplementQueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack obj = new ImplementQueueUsingStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek()); // 1
        System.out.println(obj.pop());  // 1
        System.out.println(obj.peek()); //2
        System.out.println(obj.empty()); // false
    }
}
