public class pattern {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        int mid = n/2;
        for(int i = mid; i>0; i--){
            for(int j = mid; j > i; j++){
                System.out.print("*" + " ");
            }
        }
        System.out.println();
    }
}
