import java.util.ArrayList;
import java.util.Arrays;

public class recursion_sorting {
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        int size = arr.length -1;
        bubblesort(arr,arr.length - 1,0);
        System.out.println(Arrays.toString(arr));

        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubblesort(arr, row, col + 1);
        }
        else{
            bubblesort(arr, row - 1, 0);
        }
    }
    static void selectionsort(int[] arr, int row, int col,int max){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[max]){
                selectionsort(arr, row, col + 1, col);
            }
            else{
                selectionsort(arr, row, col + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionsort(arr, row - 1, 0, 0);
        }
    }
}
