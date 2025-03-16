import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {384,12, 34, 55, 67, 86, 34, 92};
        search(arr, 55);

        String name = "kunal";
        System.out.println(Arrays.toString(name.toCharArray()));

        string(name ,'u');

        searchRange(arr , 67 ,1,5);
        int[] nums = {3,4,5,6,7,0,1,2};
        System.out.println(pivot(nums));



    }

    static void search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }

    static void string(String str, char target) {
        for (char ch : str.toCharArray()) {
            if(ch == target){
                System.out.println(ch);
            }
        }
    }

    static void searchRange(int[] arr, int target, int start,int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] <= arr[mid]){
                start =  start + 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }

}
