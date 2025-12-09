public class FibonacciNumber_509 {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int num1 = 1, num2 = 1, res = 1;
        for(int i = 0; i < n - 2; i++){
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        FibonacciNumber_509 obj=new FibonacciNumber_509();

        int n=2;
        System.out.println("Sum: "+obj.fib(n));
    }
}