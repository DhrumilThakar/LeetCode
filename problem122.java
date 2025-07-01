/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.*/
public class problem122 {
    public static int maxProfit(int[] arr)
    {
        int maxProfit = 0;
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                maxProfit = maxProfit+(arr[i]-arr[i-1]);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example input
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
