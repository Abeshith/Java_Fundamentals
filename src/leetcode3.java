import java.util.Arrays;

public class leetcode3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,34,65,67};
        System.out.println(nextinsertposition(arr,35));

        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));

        int[] arr1 = {5,7,7,8,8,10};
        int[] ans = searchRange(arr1,7);
        System.out.println(Arrays.toString(ans));



    }




    static int nextinsertposition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                ans = mid;
                start = mid + 1;
            }else if (target == arr[mid]) {
                return mid;
            }
        }
        return ans +1;
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target > letters.length - 1) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }
        }
        return (char) start;
    }
        public static int[] searchRange(int[] arr, int target) {
            int first = firstposition(arr,target);
            int last = lastposition(arr,target);

            return new int[]{first,last};
        }
        public static int firstposition(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1;
            int ans = -1;
            while( start <= end ){
                int mid = start + (end - start ) / 2;
                if(target == arr[mid]){
                    ans = mid;
                    end = mid - 1;
                }else if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            return ans;
        }

        public static int lastposition(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1;
            int ans = -1;
            while( start <= end ){
                int mid = start + (end - start ) / 2;
                if(target == arr[mid]){
                    ans = mid;
                    start = mid + 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            return ans;
        }

    }


