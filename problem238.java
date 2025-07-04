/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.*/
public class problem238 {
    public static int[] productExceptSelf(int[] arr){
        int[] result = new int[arr.length];
        result[0]=1;

        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]*arr[i-1];
        }
        int right = 1;
        for(int i = arr.length-1;i>=0;i--){
            result[i] = result[i] * right;
            right = right*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}