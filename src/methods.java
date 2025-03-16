import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
       //sum();

        //  int ans = sum2();
      //  System.out.println(ans);

     /*   String Message = greeting();
        System.out.println(Message);  */

    /*    int ans = sum3(12,90);
        System.out.println(ans);  */

        String msg = mygreet("Abi");
        System.out.println(msg);


    }


    // return method
    static String greeting(){
        String greet = "Hello";
        return greet;
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
// method
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println(("The sum is: " + num1 + " + " + num2 + " = " + (num1 + num2)));
    }
  // passing values argument
    static int sum3(int a , int b){
        int add = a + b;
        return add;
        }
    static String mygreet(String name){
        String greet = "Hello " +  name;
        return greet;
    }
}


