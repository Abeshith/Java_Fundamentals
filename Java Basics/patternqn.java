import java.util.Scanner;

public class patternqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        char[] m = {'h','e','l','l','o'};
        pattern1(n);
        System.out.println("\n");
        pattern2(n);
        System.out.println("\n");
        pattern3(n);
        System.out.println("\n");
        pattern4(n);
        System.out.println("\n");
        pattern5(n);
        System.out.println("\n");
        pattern6(n);

    }
    static void pattern1(int n) {
        for(int row = 0;row<= n;row++) {
            for (int col = 1; col <= row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for(int row = 1;row<= n;row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for(int row = 1;row<= n;row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for(int row = 1;row<=n;row++){
            for(int col = 1; col <= row ;col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 1;row <= n;row++){
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1;row<= n;row++) {
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int row = 1;row<= n;row++) {
            for (int space = n - row; space > 0; space--) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
