public class rangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = Xor(b) ^ Xor(a - 1);
        System.out.println(ans);

        int ans2 = 0;
        for(int i = a; i <= b; i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    static int Xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a + 1;
        }
        return 0;
    }
}
