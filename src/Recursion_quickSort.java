import java.util.Arrays;

public class Recursion_quickSort {
    public static void main(String[] args) {
        int[] arr = {23,46,64,56,22,7,32,67,21};

        QuickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    static void QuickSort(int[] arr,int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + ( end - start ) / 2;
        int pivot = arr[mid];

        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        QuickSort(arr,low,end);
        QuickSort(arr,start,high);
    }
}
