import java.util.Arrays;

public class problems2 {
    public static void main(String[] args) {


        int[] arr = {1900, 2, 23, 2, 34 ,945};
      /*  swap(arr, 1, 5);
        System.out.println(Arrays.toString(arr));  */

       // System.out.println(maxrange(arr , 0,4));

        System.out.println(max(arr));

    }
    static void swap(int[] arr, int index1 ,  int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while( start < end ){
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i =1; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxrange(int[] arr , int start, int end) {
        int max = arr[start];
        for (int i = start;i<=end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;
    }
}
