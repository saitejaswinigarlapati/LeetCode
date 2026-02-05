import java.util.Scanner;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PowerOfFour obj=new PowerOfFour();

        System.out.print("n : ");
        int n=sc.nextInt();

        System.out.print(n + " is power of 4 : " + obj.isPowerOfFour(n));
    }
}

// Input: n = 16
// Output: true

// Input: n = 5
// Output: false

// Input: n = 1
// Output: true
