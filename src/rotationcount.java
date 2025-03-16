public class rotationcount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,0,1,2};
        int[] arr2 = {3,4,5,6,7,8,0,1,2,3,4};
        System.out.println(pivot(arr));
        System.out.println(pivotwithduplicates(arr2));
    }
    static int rotationcount(int[] arr) {
        int pivot = pivot(arr);
        return pivot + 1;
    }

    public static int pivot(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if( mid < end && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                if( mid > start && arr[mid] < arr[mid -1]){
                    return mid - 1;
                }
                if(arr[start] <= arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }

    public static int pivotwithduplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if( mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] || arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[start] < arr[end]) {
                    return arr[start];
                }
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return arr[mid + 1];
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return arr[mid];
                }
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    if (arr[start] > arr[start + 1]) {
                        return arr[start + 1];
                    }
                    if (arr[end] < arr[end - 1]) {
                        return arr[end];
                    }
                    start++;
                    end--;
                } else if (arr[start]  < arr[mid] || arr[start] == arr[mid] && arr[end] > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return arr[start];
        }

    }
