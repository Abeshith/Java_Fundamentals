public class linear2 {
    public static void main(String[] args) {
        int[] arr = {2, 23, 88, 44};
        int[][] arr2d ={
                {1,2,3,4},
                {4,5,5},
                {56,7,5},
                {33,94}
        };
    /*    min(arr);

        int[] ans = search(arr2d , 94);
        System.out.println(Arrays.toString(ans));

        int ans1 = max2d(arr2d);
        System.out.println(Arrays.toString(new int[]{ans1})); */



        int evenw = even(arr);
        System.out.println(evenw);

}

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }



    static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max2d(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int even(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = arr[i];
            }
        }
        return count;
    }




}
