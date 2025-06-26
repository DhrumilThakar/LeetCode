/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */
public class problem121 
{
public static int maxProfit(int[] arr)
{
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i = 0;i<arr.length;i++)
    {
        if(arr[i]<minPrice)
        {
            minPrice =arr[i];
        }
        else
        {
            maxProfit = Math.max(maxProfit,arr[i]-minPrice);
        }
    }
    return maxProfit;
}
 public static void main(String[] args) 
 {
        int[] arr = {7,1,5,3,6,4}; // Example prices array
        int result = maxProfit(arr);
        System.out.println("The maximum profit is: " + result);
 }   
}