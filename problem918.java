/*Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.*/

public class problem918{
    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {
            total += num;

            // Calculate maximum subarray sum using Kadane's algorithm
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Calculate minimum subarray sum using Kadane's algorithm
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        // If all numbers are negative, return the maximum subarray sum
        if (maxSum < 0) {
            return maxSum;
        }

        // Return the maximum of the two cases: normal max or total - min
        return Math.max(maxSum, total - minSum);
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarraySumCircular(nums)); // Output: 3
    }
}