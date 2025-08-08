import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(-2);
        s.push(0);
        s.push(4);
        s.push(-3);

        System.out.println(s.getMin()); // -3

        s.pop();
        System.out.println(s.getMin()); // -2

        s.pop();
        System.out.println(s.getMin()); // -2.
        
    }
}
