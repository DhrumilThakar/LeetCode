/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
public class problem189 {
    public static void rotate(int[] nums, int k)
    {
        int n = nums.length;
        k%=n;
        // Step 1: Reverse the entire array
        rotatedArray(nums, 0, n-1);
        // Step 2: Reverse the first k elements
        rotatedArray(nums, 0, k-1);
        // Step 3: Reverse the remaining n-k elements
        rotatedArray(nums, k, n-1);
    }
    public static void rotatedArray(int[] arr, int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example input
        int k = 3; // Number of steps to rotate
        rotate(nums, k);
        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}