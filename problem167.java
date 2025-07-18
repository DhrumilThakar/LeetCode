/* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.*/
public class problem167 {
    public static int[] twoSum(int[] arr, int target){
        int left =0;
        int right = arr.length -1;
        while(left < right){
            int sum = arr[left]+arr[right];

            if(sum == target){
                return new int[]{left +1,right+1};
            }

            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]"); // Output: Indices: [1, 2]
    }
}