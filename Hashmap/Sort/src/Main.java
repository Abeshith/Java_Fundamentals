import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {6,2,10,9,2,4,9,7};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countsort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int max = arr[0];
        // Find the maximum value
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] temp = new int[max + 1];

        for (int num : arr) {
            temp[num]++;
        }

        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                arr[index++] = i;
                temp[i]--;
            }
        }
    }
}