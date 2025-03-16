import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();

           boolean ans = isprime(n);
          System.out.println(ans);
     /*   for(int i = 1; i <= 1000; i++){
            if(isprime(i)) {
                System.out.println(i);
            }
        } */
      /*  for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        } */
    }
        static boolean isprime ( int n){
            if (n <= 1) {
                return false;
            }
            int c = 2;
            while (c * c <= n) {
                System.out.println(n);
                if (n % c == 0) {
                    System.out.println(n);
                    return false;
                }
                c++;
                System.out.println(n);
            }
            return c * c > n;
        }
        static boolean isArmstrong (int n){
            int org = n;
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem * rem * rem;
            }
            return sum == org;
        }
    }

