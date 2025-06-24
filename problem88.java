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