import java.util.Arrays;

public class Var_Args {
    public static void main(String[] args) {
        var(23,92,233,933,393,23,45,34,23,123,454,6);

        multiple(20,45,"Abe", "va", "po");

    }
    static void var(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
