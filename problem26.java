/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k. */

public class problem26 
{
    public static int removeDuplicates(int[] arr)
    {
        int flag=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[flag])
            {
                flag++;
                arr[flag]=arr[i];
            }
        }
        // Print the modified array
        System.out.print("[");
        for(int i=0;i<=flag;i++)
        {
            System.out.print(arr[i]);
            if(i<flag) System.out.print(", ");
        }
        System.out.println("]");

        return flag+1; // +1 because flag is zero-based index
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int result = removeDuplicates(arr);

        System.out.println("The new length of the array is: " + result);
    }
}