/*Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.*/

public class problem918{
    public static int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int currentMax= 0;
        int currentMin = 0;
        int total =0;

        for(int i =0;i<nums.length;i++){
            total+=nums[i];
            currentMax +=nums[i];
            
            max = Math.max(max,currentMax);

            if(currentMax<0){
                currentMax=0;
            }

            currentMin+=nums[i];
            min = Math.min(min,currentMin);
            if(currentMin>0){
                currentMin =0;
            }
        }
        return max<0?max:Math.max(max,total-min);
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarraySumCircular(nums)); // Output: 3
    }
}