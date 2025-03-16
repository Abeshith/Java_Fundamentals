import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;
import java.util.List;

public class recursion_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sorted(arr, 0));

        int[] arr2 = {45, 89, 9, 83, 22, 5,22, 2, 21};
        System.out.println(linearSearch(arr2, 22, 0));
        System.out.println(linearsearch1(arr2, 22, 0));
        System.out.println(lastindex(arr2,22,arr2.length-1));


    }

    static boolean issorted(int[] arr){
        for(int i = 0; i< arr.length - 1; i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }
        //sorted checking
    static boolean sorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
         return arr[index] <= arr[index+1] && sorted(arr, index+1);
    }

            //recursion linearsearch
    static boolean linearSearch(int[] arr, int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index+1);
    }

                // recursion linear earch index
    static int linearsearch1(int[] arr, int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearsearch1(arr, target, index+1);
    }

    // recursion linear search last index
    static int lastindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return lastindex(arr, target, index-1);
    }

}
