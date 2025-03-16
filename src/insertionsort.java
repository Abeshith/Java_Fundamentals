import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,1,2,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] nums){
        for(int i = 0;i < nums.length -1;i++){
            for(int j = i+1; j > 0;j--){
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j -1);
                }else{
                    break;
                }
            }
        }
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                swap(arr, i, index);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
