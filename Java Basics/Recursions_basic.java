public class Recursions_basic {
    public static void main(String[] args) {
      //  number(5);

      int n = factorial(5);
      System.out.println(n);

      int y = sum(12234);
      System.out.println(y);

      reverse(12234);
      System.out.println(sum);

      int ans = palindrome(12221);
      System.out.println(ans);

      int counts = countzeroes(200350, 0);
      System.out.println(counts);

      int steps = stepstoozeroes(14,0);
      System.out.println(steps);
    }
    static void number(int n){
        if(n < 1){
            return;
        }
        number(n - 1);
        System.out.println(n);
    }

    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return (n % 10) + sum(n / 10);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    static int palindrome(int n){
        reverse(n);
        return n == sum ? 1 : 0;
    }
    static int countzeroes(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            return countzeroes(n / 10, count + 1);
        }
        else{
            return countzeroes(n / 10, count);
        }
    }

    static int stepstoozeroes(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0){
            return stepstoozeroes(n / 2, count + 1);
        }
        else{
            return stepstoozeroes(n - 1, count + 1);
        }
    }
}
