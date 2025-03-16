import java.util.*;
public class Recursion_Permutations1 {
    public static void main(String[] args) {
        List<String> ans = combination("","23");
        System.out.println(ans);
    }
    public static List<String> combination(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(combination(p + ch, up.substring(1)));
        }
        return list;
    }
}
