/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */

public class problem169
{
    public static int majorityElement(int[] arr)
    {
        int flag=0;
        int candidate=0;
        for(int i =0;i<arr.length;i++)
        {
            if(flag==0)
            {
                candidate = arr[i];
            }
            if(arr[i]==candidate)
            {
                flag++;
            }
            else
            {
                flag--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) 
    {
        int[] arr = {2,2,1,1,1,2,2}; // Example array
        int result = majorityElement(arr);
        System.out.println("The majority element is: " + result);
    }
}