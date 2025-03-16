import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9,23,36,45,56,87,99};
        int[] arr1 = {99, 88, 77, 66, 55, 44, 33, 22, 11, 10};
        int target = 57;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

        int ans1 = binarysearchdescending(arr1,88);
        System.out.println(ans1);


    }
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    static int binarysearchdescending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }


}
