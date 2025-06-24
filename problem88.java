/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n. */
public class problem88{
   public static void merge(int[] arr1, int m, int[]arr2, int n)
{
    int pointer1 =m-1;
    int pointer2 = n-1;
    int pointer =(m+n)-1;
    for(int i =0;i<arr1.length;i++)
    {
        if(pointer1>pointer2)
        {
            arr1[pointer]=arr1[pointer1];
            pointer1--;
        }
        else{
            arr1[pointer]=arr2[pointer2];
            pointer2--;
        }
        pointer--;
    }
    while(pointer2>=0)
    {
        arr1[pointer]=arr2[pointer2];
        pointer2--;
        pointer--;
    }
}
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(arr1, m, arr2, n);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}