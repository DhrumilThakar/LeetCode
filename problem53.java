/*Given an integer array nums, find the subarray with the largest sum, and return its sum.*/
public class problem53
{
    public static int maxSubArray(int [] arr)
    {
        /*We use Kadans Algorithm here we will not consider any -ve number instead we use 0 */
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0;i<arr.length;i++)
        {
            currentSum +=arr[i];
            if(currentSum>maxSum)
            {
                maxSum = currentSum;
            }
            if(currentSum <0)
            {
                currentSum =0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}