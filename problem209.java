/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.*/
public class problem209 {
    public static int minSubArrayLen(int[] arr, int target){
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++){
            sum += arr[i];

            while(sum>=target){
                minLength = Math.min(minLength, i-left+1);
                sum -= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0: minLength;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(nums, target)); // Output: 2
    }
}
