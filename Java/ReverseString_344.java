public class ReverseString_344 {
    public void reverseString(char[] s) {
        int len=s.length;
        int left=0,right=len-1;
        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ReverseString_344 obj=new ReverseString_344();
        char[] s={'h','e','l','l','o'};
        obj.reverseString(s);
        String reversed = new String(s);
        System.out.println("Reversed String: "+reversed);
    }
}