import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_permutations {
    public static void main(String[] args) {
        permutation("","abc");
        List<String> ans = permutations("","abb");
        System.out.println(ans);

    }
    public static void permutation(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String r = p.substring(i,p.length());
            permutation(f + ch + r,up.substring(1) );
        }
    }

    public static List<String> permutations(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            list.addAll(permutations(first + ch + second,up.substring(1)));
        }
        return list;
    }
}
