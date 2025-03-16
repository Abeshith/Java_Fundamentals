import java.util.Arrays;

public class recursion_mergesort {
    public static void main(String[] args) {
        int[] arr = {53,32,23,64,56,67,39,78};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] first = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    static int[] merge(int[] first, int[] second){
        int[] size = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                size[k] = first[i];
                i++;
            } else {
                size[k] = second[j];
                j++;
            }
            k++;
        }

            while( i < first.length){
                size[k] = first[i];
                i++;
                k++;
            }
            while(j < second.length){
                size[k] = second[j];
                j++;
                k++;
            }
            return size;
    }
}
