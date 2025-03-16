import java.util.Arrays;

public class Recursion_MergeSort {
    public static void main(String[] args) {
        int[] arr = {23, 57, 34, 68, 67, 49, 24, 62};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        mergesortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }

    static void mergesortInplace(int[] arr, int start, int end) {
        if (end - start == 1) return;

        int mid = start + (end - start) / 2;

        mergesortInplace(arr, start, mid);
        mergesortInplace(arr, mid, end);

        mergeinplace(arr, start, mid, end);
    }
    static void mergeinplace(int[] arr, int start, int mid, int end) {
        int[]  mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int x = 0; x < mix.length; x++){
            arr[start+x] = mix[x];
        }
    }
}
