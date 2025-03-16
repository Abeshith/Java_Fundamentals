public class recursion_rotated {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(rotatedbinarysearch(arr,8,0,arr.length - 1));

        int[] arr2 = {15,22,34,46,55,64,73};
        System.out.println(binarysearch(arr2,55,0,arr2.length - 1));
    }
    static int rotatedbinarysearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if (target > arr[start] && target < arr[mid]) {
                return rotatedbinarysearch(arr, target, start, mid - 1);
            } else {
                return rotatedbinarysearch(arr, target, mid + 1, end);
            }
        }
        if(target > arr[mid] && target < arr[end]){
            return rotatedbinarysearch(arr, target, mid + 1, end);
        }
        else{
            return rotatedbinarysearch(arr, target, start, mid - 1);
        }
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binarysearch(arr, target, mid + 1 ,end);
        }
        else{
            return binarysearch(arr, target, start, mid - 1);
        }
    }
}
