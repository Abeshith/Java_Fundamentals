public class shadowing {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        int x;
// System.out.println(x); //raises  error until val initialzed
        x = 100;
        System.out.println(x);
        num();
    }
    static void num(){
        System.out.println(x);
    }
}
