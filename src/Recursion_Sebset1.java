import java.util.ArrayList;
import java.util.List;

public class Recursion_Sebset1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = sebset1(arr);
        for (List<Integer> list1 : list) {
            System.out.println(list1);
        }
    }

    //iterative approach
    public static List<List<Integer>> sebset1(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int size = outer.size();
            for(int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
