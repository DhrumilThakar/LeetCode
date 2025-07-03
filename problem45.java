/*You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].*/
public class problem45 {
    public static int jump(int[] arr){
        int lastIndex = 0;
        int fast = 0;
        int jump = 0;
        for(int i =0;i<arr.length-1;i++){
            fast = Math.max(fast,i+arr[i]);
            if(i==lastIndex){
                lastIndex = fast;
                jump++;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4}; // Example input
        int result = jump(nums);
        System.out.println("Minimum number of jumps to reach the end: " + result);
    }
}