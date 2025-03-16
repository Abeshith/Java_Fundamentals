import java.util.List;
import java.util.*;


public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,2,5,2,3};
        List<Integer> ans = targetIndices(arr2, 2);
        System.out.println(ans);
        int ans2 = duplicate(arr2);
        System.out.println(ans2);


    }
    static List<Integer> AllMissingValues(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static int MissingValues(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int index = 0;index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return arr[index];
            }
        }
        return arr.length;
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length;index++){
            if(nums[index] == target){
                ans.add(index);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
