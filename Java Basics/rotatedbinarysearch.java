public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        System.out.println(rotatedBinarySearch(arr,8));
    }
    static int rotatedBinarySearch(int[] arr, int target) {
        int pivot = pivot(arr);

        if (arr[pivot] == target) {
            return pivot;
        }
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(target <= arr[0]){
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
        if(target > arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            else if(arr[mid] > arr[start]){
                start = mid + 1;
            }
        }
        return -1;
    }

}
