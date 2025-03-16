import java.util.Arrays;

public class scope {
    public static void main(String[] args) {
    /*    int a = 20;
        int b = 40;
        {
            a = 100;
            int c = a + b + 30;
            System.out.println(c);
        }
        System.out.println(a);*/
        int ans = strstr("sadbutsad",  "sad");
        System.out.println(ans);
    }

    private static int strstr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        while(index != -1){
            return index;
        }
        return -1;
    }
}








