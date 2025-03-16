public class rotated1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(pivot(arr));
        System.out.println(search(arr , 2));
    }
        public static boolean search(int[] nums, int target) {
            int pivot = pivot(nums);
            if(pivot == -1){
                return binarysearch(nums, target, 0, nums.length - 1) != -1;
            }
            if(nums[pivot] == target){
                return true;
            }
            if(target > nums[0]){
                return binarysearch(nums, target, 0, pivot - 1) != -1;
            }
            if(target < nums[0]){
                return binarysearch(nums, target, pivot + 1, nums.length - 1) != -1;
            }
            return false;
        }
        public static int binarysearch(int[] arr,int target,int start,int end){
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(target >= arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        public static int pivot(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            if(arr.length == 1 || arr[start] < arr[end]){
                return -1;
            }
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(mid < end && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                if(mid > start && arr[mid] < arr[mid - 1]){
                    return mid - 1;
                }
                if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                    if(arr[start] > arr[start + 1]){
                        return start;
                    }
                    start++;

                    if(arr[end] < arr[end - 1]){
                        return end - 1;
                    }
                    end--;
                }
                else if(arr[start] < arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }
}
