import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> cis=new HashMap<>();
        HashMap<Character,Integer> cit=new HashMap<>();
        for(int i=0; i< s.length();i++){
            if(!cis.containsKey(s.charAt(i))){
                cis.put(s.charAt(i),i);
            }
            if(!cit.containsKey(t.charAt(i))){
                cit.put(t.charAt(i),i);
            }
            if (!cis.get(s.charAt(i)).equals(cit.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IsomorphicStrings obj=new IsomorphicStrings();
        System.out.print("s : ");
        String s=sc.nextLine();
        System.out.print("t : ");
        String t=sc.nextLine();
        System.out.println("Isomorphic strings : " + obj.isIsomorphic(s, t));
    }
}

// Input: s = "egg", t = "add"
// Output: true

// Input: s = "foo", t = "bar"
// Output: false

// Input: s = "paper", t = "title"
// Output: true