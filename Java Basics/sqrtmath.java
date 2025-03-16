public class sqrtmath {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(40,3));

        System.out.println(newtonsqrt(40));

        factors(20);
    }
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;
        double ans = 0.0;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) return m;
            else if (m * m > n) e = m - 1;
            else s = m + 1;
        }

            double incr = 0.1;
            for(int i = 0; i < p; i++){
                while (ans * ans < n){
                    ans = ans + incr;
                }
                ans = ans - incr;
                incr /= 10;
            }
        return ans;
    }

    //Newton sqroot
    static double newtonsqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.5 ){
                break;
            }
            x = root;
        }
        return root;
    }

    //factors of n
    static void factors(int n){
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " " + n/i + " ");
            }
        }
    }
}
