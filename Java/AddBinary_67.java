import java.util.Scanner;
public class AddBinary_67 {
        public String addBinary(String a, String b) {
            int s=Integer.parseInt(a,2);
            int k=Integer.parseInt(b,2);
            int add=s+k;
            return Integer.toBinaryString(add);
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

