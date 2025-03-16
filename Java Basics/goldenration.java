public class goldenration {
    public static void main(String[] args) {
        int n= 20;
        for(int i = 1;i <= n;i++){
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n))  / Math.sqrt(5));
        //return (int)((Math.pow(((1 + Math.sqrt(5)) / 2) , n) )/ Math.sqrt(5) );
    }
    // Magical Number



}
