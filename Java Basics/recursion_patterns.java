public class recursion_patterns {
    public static void main(String[] args) {
        pattern2(5,0);
        System.out.println();
        pattern1(5);
    }
    static void pattern1(int n){
        if(n < 1){
            return;
        }
        pattern1(n-1);
        for(int i = 1; i <= n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }

    static void pattern2(int row, int col){
        if(row == 0 ){
            return;
        }
        if(col < row){
            pattern2(row, col+1);
            System.out.print("*" + " ");
        }
        else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }
}
