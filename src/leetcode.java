import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int ans = add2d(arr);
        System.out.println(ans);
    }
    static int add2d(int[][] arr){
        int sum = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
