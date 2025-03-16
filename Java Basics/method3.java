import java.lang.reflect.Array;
import java.util.Arrays;

public class method3 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        array(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void array(int[] num){
        num[0] = 99;
    }
}
