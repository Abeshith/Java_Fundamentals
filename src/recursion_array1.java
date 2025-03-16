import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;

public class recursion_array1 {
    public static void main(String[] args)
    {
        int[] arr2 = {45, 89, 9, 83, 22, 5,22, 2, 21};
        allindex(arr2,22,0);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(array(arr2,22,0,list1));

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(array(arr2,22,0,list2));
    }
    // returning all indexes
    static ArrayList<Integer> list = new ArrayList<>();
    static void allindex(int[] arr, int target,int index){

        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        allindex(arr,target,index +1);
    }

    static ArrayList<Integer> array(int[] arr, int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return array(arr,target,index +1,list);
    }

    static ArrayList<Integer> Arraylist(int[] arr, int target,int index){
        ArrayList<Integer> listed = new ArrayList<>();
        if(index == arr.length){
            return listed;
        }
        if(arr[index] == target){
            listed.add(index);
        }
        ArrayList<Integer> list3 = Arraylist(arr,target,index +1);
        listed.addAll(list3);
        return listed;
    }
}
