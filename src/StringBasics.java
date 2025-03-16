import java.util.Arrays;

public class StringBasics {
    public static void main(String[] args) {
//        String a = "Abi";
//        int k = 20;
//        String b = "Abi";
//        String s = "The Sky is blue";
//        System.out.println(a == b);
//
//        String name1 = new String("Abe");
//        String name2 = new String("Abi");
//        System.out.println(name1.equals(name2));
//
//        float d = 3424.557f;
//        System.out.printf("formated no id %.2f", d);
//        System.out.println("\n");
//
//        String alphabet = "";
//        for(int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            System.out.println(ch);
//        }
//
//        StringBuilder build = new StringBuilder();
//        build.append(s);
//        build.replace(0,1,s);
//        System.out.println(build.toString());
//
//        String str = "Hello World";
//        StringBuilder x = new StringBuilder();
//        x.append(str);
//        x.length();
//        String[] arr = x.toString().split(" ");
//        String last = arr[arr.length-1];
//        System.out.println(last.length());
//        System.out.println(Arrays.toString(arr));

        String S = "geeks5";
        int n = S.length();
        System.out.println(n);
        String word = S.substring(0,S.length() - 1);
        System.out.println(word);
        int last = S.length()-1;
        int count = word.length();
        System.out.println(count);
        System.out.println(last);
        if(count == last){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

       // System.out.println(S.charAt());


        }
        static int reverse(String S){
            String original = S;
             StringBuilder st = new StringBuilder();
             st.append(S);
             st.reverse();
            System.out.println(st);
            if(st.toString().equals(original)){
                     return 1;
            }
            return 0;
        }


}
