import java.util.Scanner;

public class problems {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

    /*    if( a == 10 || b == 10){
            System.out.println("Hello World!");
        } */


   /*     if (a == 10 && b == 20) {
            System.out.println("Hello World!");
        } else{
            System.out.println("Hello Earth!");
        } */

   /*     Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");  */


        //Fibonaccci

     /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int count = 2;

        while (count <= n) {
            int temp = y;
            y = y + x;
            x = temp;
            count++;
        }
        System.out.println(y);  */


        //Count the numbers occurence

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int remainder = n % 10;
            if (remainder == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);  */

        //reverse

    /*    int n = 78556;
        int count = 0;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            count = count * 10 + remainder;
        }
        System.out.println(count);   */

   /*     int n = 78648;
        int count = 0;

        while( n > 0) {
            int rem = n % 10;
            System.out.println(n);
            if( rem == 8){
                count++;
                System.out.println(count);
            }
            n = n / 10;
            System.out.println(n);
        }
        System.out.println(count);  */


    }
}

