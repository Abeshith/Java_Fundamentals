import java.util.Arrays;

public class leetcode5 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int[] ans = twoSum(arr,-1);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }
            else if (sum < target ) {
                start++;
            }
            else if (sum > target) {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
