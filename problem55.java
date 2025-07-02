/*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.*/
public class problem55 {
    public static boolean canJump(int [] arr){
        int last_index=0;
        for(int i=0;i<arr.length;i++){
            if(i>last_index){
                return false;
            }
            last_index = Math.max(last_index, i+arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums)); // Output: true
    }
}