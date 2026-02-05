public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String s = "6777133339";
        
        for (int i = 9; i >= 0; i--) {
            String check = String.valueOf(i).repeat(3); // Java 11+
            if (s.contains(check)) {
                System.out.println(check);
                return;
            }
        }
        
        System.out.println(""); 
    }
}

// Input: num = "6777133339"
// Output: "777"

// Input: num = "2300019"
// Output: "000"

// Input: num = "42352338"
// Output: ""