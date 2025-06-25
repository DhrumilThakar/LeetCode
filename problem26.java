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