import java.util.ArrayList;

public class Recursions_Arrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(isSorted(arr,0));

        int[] nums = {12,34,47,89,45,23,44};
        System.out.println(linearSearch(nums,89,0));

        int[] elems = {23,67,33,6,24,56,7,54,34,7,32,24,59};
        ArrayList<Integer> list = findallindex(elems,24,0,new ArrayList<>());
        System.out.println(list);
    }
    static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }

    static int linearSearch(int[] arr, int target, int index) {
        if(index == arr.length-1){
            return 0;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, target, index+1);

        //for boolean
        //return arr[index] == target || linearSearch(arr, target, index+1);
    }
    // Retruning a array list
    static ArrayList<Integer> findallindex(int[] arr, int target,int index,ArrayList<Integer> list) {
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findallindex(arr, target, index+1, list);
    }
}
