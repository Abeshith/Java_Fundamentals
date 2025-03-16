import java.util.ArrayList;

public class Recursions_Subset {
    public static void main(String[] args) {
        String str = "abc";
        subset("",str);
        System.out.println(subsetArr("","abc"));

    }
    static void subset(String str1, String str2) {
        if (str2.isEmpty()) {
            System.out.println(str1);
            return;
        }
        char ch = str2.charAt(0);

        subset(str1 + ch, str2.substring(1));
        subset(str1, str2.substring(1));

    }
    static ArrayList<String> subsetArr(String str1, String str2) {
        if (str2.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str1);
            return list;
        }
        char ch = str2.charAt(0);
        ArrayList<String> left =  subsetArr(str1 + ch, str2.substring(1));
        ArrayList<String> right = subsetArr(str1, str2.substring(1));

        left.addAll(right);
        return left;

    }
}
