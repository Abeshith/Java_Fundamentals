import java.util.Arrays;

public class leetcode1 {
    public static void main(String[] args) {
   /*     int[] arr2 = {-2,-1,0,0,1,1,2,3};
        int ans2 =maximumCount(arr2);
        System.out.println(ans2);




        int[][] arrd = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(Arrays.deepToString(arrd));

        int ans3 = count(arrd);
        System.out.println(ans3);*/

        int[] arr1 = {0,2,1,0};
        int ans = findPeakElement(arr1);
        System.out.println(ans);


   /*     int[] arr = {2,1};
        int ans1 = peakelement(arr);
        System.out.println(ans);*/




    }

    public static int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                positive++;
            }if (nums[i] < 0){
                negative++;
            }
        }
        if (positive > negative){
            return positive;
        }else{
            return negative;
        }
    }

    static int count(int[][] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int findPeakElement(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    static int peakelement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while( start < end){
            int mid = start + (end - start)/2;
            System.out.println(mid);
            if (nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }


}
