/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k. */
public class problem27 
{
    public static int removeElement(int[] arr, int val)
    {
        int k=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        int k = removeElement(arr, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}