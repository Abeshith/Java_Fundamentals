public class split_array {
    // split array largest sum
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }
   static int splitArray(int[] nums, int k){
       int start = 0;
       int end = 0;
       for (int num : nums) {
           start = Math.max(start, num);
           end = end + num;
       }
       while(start < end) {
           int mid = start + (end - start) / 2;
           int count = count(nums, mid);
           if(count <= k){
               end = mid;
           }else{
               start = mid + 1;
           }
       }
    return end;
    }
    static int count(int nums[],int mid){
        int sum = 0;
        int count = 1;
        for (int num : nums) {
            if (sum + num > mid){
                sum = num;
                count++;
            }else{
                sum += num;
            }
        }
        return count;
    }
}
