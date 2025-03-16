import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //    ArrayList<Integer> list = new ArrayList<Integer>();
     /*   list.add(15);
        list.add(29);
        list.add(38);
        list.add(44);
        list.add(95);

        list.set(0,6);
        System.out.println(list);
        System.out.println(list.contains(56)); */
       /*  for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }  */

     ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
       }
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);


    }
}
