public class recursion_lvl1 {
    public static void main(String[] args) {
        int n = 123321;

        System.out.println(sum);
        System.out.println(palindrome1(n));

        System.out.println(countzeores(2000000,0));

        System.out.println(noofsteps(123,0));

        int[] arr = {1,10};
        System.out.println(maxIndexDiff(arr));

    }
    static int rev(int n){
        int digits = (int)(Math.log(n)) + 1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10, digits - 1);
    }

    static int sum = 0;


    static boolean palindrome(int n){
        return (n == rev(n));
    }

    static boolean palindrome1(int n){
        String S = Integer.toString(n);
        int s = 0;
        int e = S.length() - 1;
        while(s <= e){
            if(S.charAt(s) != S.charAt(e)){
                return false;
            }
            s += 1;
            e -= 1;
        }
        return true;
   }

   static int countzeores(int n,int count){
        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            return countzeores(n / 10, count+1);
        }
        else{
            return countzeores(n/10, count);
        }
   }

   static int noofsteps(int n,int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return noofsteps(n/2, steps+1);
        }
        else{
            return noofsteps(n - 1, steps+1);
        }
   }
    static int maxIndexDiff(int[] arr) {
        int max  = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
