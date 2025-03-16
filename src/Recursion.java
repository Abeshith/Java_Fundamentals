import java.security.spec.RSAOtherPrimeInfo;

public class Recursion {
    public static void main(String[] args) {
//        int ans = fibbonacci(3);
//        System.out.println(ans);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fibbonacci(i));
//        }

        int[] arr = {34,36,57,58,89,79};
        System.out.println(binarysearch(arr,89,0,arr.length-1));
    }
    //Function to print message five times without modifying the first function
    static void msg(){
        System.out.println("Hello World");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello World");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello World");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello World");
    }


    //Function to print numbers 1 2 3 4 5  without modifying the first function
    static void nums(int n){
        System.out.println(n);
        nums1(2);
    }
    static void nums1(int n){
        System.out.println(n);
        nums2(3);
    }
    static void nums2(int n){
        System.out.println(n);
    }

    // The above methods have the same body and same fn only the parameters changes
    static void printnums(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        printnums(n + 1);
    }
    static int fibbonacci(int n) {
        if(n <= 1){
            return n;
        }
        return  fibbonacci(n - 1) + fibbonacci(n - 2);
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start ) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarysearch(arr, target, start, mid - 1 );
        }
        return binarysearch(arr, target, mid + 1, end);
    }
}
