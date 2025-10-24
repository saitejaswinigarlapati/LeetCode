public class FibonacciNumber509 {
    public int fib(int n) {
        int result = 0;
        if(n>1){
            result = fib(n-1) + fib(n-2);
        } else {
            return n;
        }
        return result;
    }
    public static void main(String[] args) {
        FibonacciNumber509 obj=new FibonacciNumber509();

        int n=4;

        System.out.println( obj.fib(n));
        
    }
}

// Input: n = 3
// Output: 2

// Input: n = 4
// Output: 3