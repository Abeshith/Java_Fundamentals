public class Recursion_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,24,34,44,56,77,87};

        int ans = binarySearch(arr,56,0,arr.length-1);
        System.out.println(ans);

        int[] nums = {44,56,77,87,23,24,34,39};

        int soln = rotatedBinarySearch(nums,24,0,arr.length-1);
        System.out.println(soln);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;

        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearch(arr, target, mid + 1, end);
        }
        else{
            return binarySearch(arr, target, start, mid - 1);
        }
    }
    static int rotatedBinarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] < arr[mid]){
            if(target < arr[mid] && target > arr[start]){
                return rotatedBinarySearch(arr, target, start, mid - 1);
            }
            else{
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }
        if(target > arr[mid] && target < arr[end]){
            return rotatedBinarySearch(arr, target, mid + 1, end);
        }
        else{
            return rotatedBinarySearch(arr, target, start, mid - 1);
        }
    }
}
