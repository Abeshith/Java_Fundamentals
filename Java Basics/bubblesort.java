import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] arr2 = {2,0,2,1,1,0};
        //bubbleSort(arr);
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
     static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = max(arr,0,last);
            swap(arr,max,last);
        }
        System.out.println();
    }
    static int max(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

