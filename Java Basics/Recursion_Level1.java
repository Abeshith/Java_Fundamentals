import java.sql.SQLOutput;
import java.util.SortedMap;

public class Recursion_Level1 {
    public static void main(String[] args) {
       // reverse(5);
        System.out.println(factorial(5));

        System.out.println(digitcounts(1342));

        System.out.println(prod(253));

        reversedigit(2365);
        System.out.println(sum);

        System.out.println(countzeros(30080940));

    }
    static void reverse(int n) {
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        reverse(n-1);
   //     reverse(--n);
        System.out.print(n + " ");
    }
     static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
     }

     static int digitcounts(int n){
        if(n == 0){
            return 0;
        }
        return (n% 10) + digitcounts(n/ 10);
        //digit product
     //    return (n% 10) * digitcounts(n/ 10);
     }

     static int prod(int n){
        if(n % 10 == n){
            return n;
        }
        return n % 10 * prod(n/10);
     }


     static int sum = 0;
     static  void reversedigit(int n){
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reversedigit(n / 10);
     }


     static int countzeros(int n){
         int count = 0;
         while(n != 0){
             int rem = n % 10;
             n = n / 10;
             if(rem == 0){
                 count++;
             }
         }
         return count;
     }



}
