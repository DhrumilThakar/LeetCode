/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.*/
import java.util.*;
public class problem15 {
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i =0;i<arr.length-2;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue; // Skip duplicates for the first element
            }

            int left =i+1;
            int right =arr.length-1;
            int target = -arr[i];

            while(left<right){
                int sum = arr[left] +arr[right];

                if(sum == target){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left<right && arr[left] == arr[left + 1]) {
                        left++; // Skip duplicates for the second element
                    }
                    while (left<right && arr[right]==arr[right-1]) {
                        right--; // Skip duplicates for the third element
                    }
                    left++;
                    right--;
                }
                else if(sum <target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
