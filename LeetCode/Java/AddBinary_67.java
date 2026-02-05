import java.math.BigInteger;
import java.util.Scanner;
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            AddBinary_67 obj=new AddBinary_67();
            System.out.println("Enter number of testcases : ");
            int n=sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("a: ");
                String a = sc.nextLine();
                System.out.println("b: ");
                String b = sc.nextLine();
                System.out.println("Binary sum: " + obj.addBinary(a, b));
            }
        }
    }

