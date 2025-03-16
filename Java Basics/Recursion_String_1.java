public class Recursion_String_1 {
    public static void main(String[] args) {
        String str = "abccajana";
        removeA(str , "");
        System.out.println(removeA(str));
        String str1 = "bdeapplefkg";
        System.out.println(removestring(str1));

    }
    //given a string remove all a from it
    public static void removeA(String str, String s){
        if(str.length() == 0){
            System.out.println(s);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            removeA(str.substring(1), s);
        }
        else{
            removeA(str.substring(1), s + ch);
        }
    }
    public static String removeA(String str){
        if(str.length() == 0) return "";

        char ch = str.charAt(0);
        if(ch == 'a'){
            return removeA(str.substring(1));
        }else{
            return ch  + removeA(str.substring(1));
        }
    }
    //skip a string
    public static String removestring(String str){
        if(str.length() == 0) return "";

        if(str.startsWith("apple")) {
            return removestring(str.substring(5));
        }
        else{
            return str.charAt(0) + removestring(str.substring(1));
        }
    }
}
