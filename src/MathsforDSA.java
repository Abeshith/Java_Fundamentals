public class MathsforDSA {
    public static void main(String[] args) {
//        int n = 20;
//        for(int i = 0; i <= n; i++) {
//            System.out.println(i + " " + primenumber(i));
//        }
//        System.out.println(20);

        int n = 37;
        boolean[] arr = new boolean[n + 1];
        prime(n,arr);
    }
    static void prime(int n,boolean[] arr){
        for(int i = 2;i * i <= n;i++){
            if(!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for(int i = 2;i <= n; i++){
            if(!arr[i]){
                System.out.println(i + " ");
            }
        }
    }
    static boolean primenumber(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0 ){
                return false;
            }
            c++;
        }
        return true;
    }


}
