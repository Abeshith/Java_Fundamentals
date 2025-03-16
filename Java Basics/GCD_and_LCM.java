import java.util.ArrayList;

public class GCD_and_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(3,6));

        System.out.println(LCM(3,6));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.get(1);
    }
    static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd( b % a, a);
    }

    static int LCM(int a, int b) {
        return a * b / gcd(a, b);
    }
}
