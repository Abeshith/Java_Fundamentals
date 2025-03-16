public class amazon {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,11,15,19,23,25,29,30,32,35,39,40,45,49,57,63,71,79,86,90};
        int ans = infiniteArray(arr,35);
        System.out.println(ans);

    }

    public static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end;
            end = end * 2;
            System.out.println(start + " " + end);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(start + " " + end + " " + mid);
            if (target > arr[mid]) {
                start = mid + 1;
                System.out.println(start + " " +end + " " + mid);
            } else if (target < arr[mid]) {
                end = mid - 1;
                System.out.println(start + " " + end + " " + mid);
            } else if(target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
