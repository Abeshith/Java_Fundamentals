import java.util.Arrays;

public class binarysearch2d {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {15,27,37,49},
                {19,29,38,56}
        };
        int[] ans = matrix(arr,37);
        System.out.println(Arrays.toString(ans));

    }
    static int[] matrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while(row <matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
