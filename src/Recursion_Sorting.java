import java.util.Arrays;

public class Recursion_Sorting {
    public static void main(String[] args) {
        int[] arr = {8,6,3,2,4,0,5,1};
        BubbleSort(arr, arr.length - 1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr,int row, int col){
        if (row == 0) {
            return;
        }
        if(col < row){
            if(arr[col] > arr[col + 1]){
                swap(arr,col,col+1);
            }
            BubbleSort(arr,row,col + 1);
        }
        else{
            BubbleSort(arr,row-1,0);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
