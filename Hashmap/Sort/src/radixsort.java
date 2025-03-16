import java.util.Arrays;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91};
        radixsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void radixsort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Perform counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("count for exp " + exp + ": " + Arrays.toString(count));

        // Update count[i] to contain actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Updated count after position adjustments: " + Arrays.toString(count));

        // Build the output array using the count[] to place elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the sorted elements into the original array
        System.arraycopy(output, 0, arr, 0, n);
    }
}
