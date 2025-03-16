import java.util.Arrays;

public class mountainarray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,3,1};
       int ans = peakelement(arr);
        System.out.println(ans);

        int[] ans1 = search(arr,3);
        System.out.println(Arrays.toString(ans1));
    }

    static int[] search(int[] arr,int target){
        int first = firstposition(arr,target);
        int last = lastposition(arr,target);

        return new int[]{first,last};
    }

   static int peakelement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
   }
    static int firstposition(int[] arr, int target){
        int start = 0;
        int end = peakelement(arr);
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                ans = mid;
                end = mid - 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int lastposition(int[] arr, int target){
        int start = peakelement(arr);
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                ans = mid;
                start = mid + 1;
            }else if(target < arr[mid]){
                start = mid - 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
