public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int res = 0;
        int fac = 1;
        
        while(n != 0){
            res += fac * (n % 2 == 0 ? 1 : 0);
            fac *= 2;
            n /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        ComplementOfBase10Integer obj= new ComplementOfBase10Integer();

        int n=5;
        System.out.printf(n+"'s Complement: "+obj.bitwiseComplement(n));
    }
}
