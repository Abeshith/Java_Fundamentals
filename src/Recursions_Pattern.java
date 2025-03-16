public class Recursions_Pattern {
    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(5);
        pattern3(5);
        pattern4(5);
    }
    static void Pattern1(int n) {
        if(n < 1){
            return;
        }
        Pattern1(n - 1);
        for(int i = 1; i <= n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    static void Pattern2(int n) {
        if(n < 1){
            return;
        }
        for(int i = 1; i <= n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        Pattern2(n -1);
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
