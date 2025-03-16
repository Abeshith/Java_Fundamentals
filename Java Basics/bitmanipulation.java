import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class bitmanipulation {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(oddeven(n));
        int[] arr = {2,2,3};
        System.out.println(singleccurence(arr));
        System.out.println(Magicno(6));

        System.out.println(digits(3 ,2));
        System.out.println(power(3,6));

        System.out.println(Integer.toBinaryString(45));
        System.out.println(setbit(45));

    }
    static int oddeven(int n) {
        if ((n & 1) == 1){
            return 0;
        }
        else {
            return 1;
        }
    }

    static int singleccurence(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
    static int Magicno(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }

    static int digits(int n, int base){
        int ans = (int)((Math.log(n) / Math.log(base)) + 1);
        return ans;
    }
    static int power(int base,int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }

    static int setbit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }


}
