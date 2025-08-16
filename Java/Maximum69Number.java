import java.util.Scanner;

public class Maximum69Number {
    public int maximum69Number (int num) {
        char[] digits=String.valueOf(num).toCharArray();
        for(int i =0; i < digits.length;i++){
            if (digits[i] == '6'){
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
    public static void main(String[] args) {
        Maximum69Number obj=new Maximum69Number();
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int num=sc.nextInt();
        System.out.print("Maximum number : "+obj.maximum69Number(num));
    }
}

// Input: num = 9669
// Output: 9969

// Input: num = 9996
// Output: 9999

// Input: num = 9999
// Output: 9999