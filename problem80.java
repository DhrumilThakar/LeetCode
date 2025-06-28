/*Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.*/
public class problem80 
{
    public static int removeDuplicates(int [] arr)
    {
        if(arr.length <=2)
        {
            return arr.length;
        }
        int j = 2;
        for(int i =2;i<arr.length;i++)
        {
            if(arr[i]!=arr[j-2])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) 
    {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);
        System.out.println("Length of modified array: " + k); // Output: 5
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
