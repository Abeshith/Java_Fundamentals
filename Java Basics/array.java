import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    //    int[] arr = new int[5];
    //    Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,4,5,2,8,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
       /* arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        System.out.println(arr[1]); */

  /*      for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      //  System.out.println(arr[0]);
    /*    for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println(Arrays.toString(arr));  */



        // 2D Array


  /*      int[][] arr2d = new int[3][];
        int[][] arrd = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(arrd));  */


        int[][] arr2d = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < arr2d.length; i++) {
             for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextInt();
                 System.out.println(arr2d[i][j] + " ");
            }
        }


  /*      for (int i = 0;i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }  */

        for (int i = 0; i < arr2d.length; i++) {
             System.out.println(Arrays.toString(arr2d[i]));
         }

    /*    for (int[] ints : arr2d) {
            System.out.println(Arrays.toString(ints));
        } */

   /*     int[][] arr2d = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
*/
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
