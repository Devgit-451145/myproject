package m.dev.leetcode.array.easy;

public class BuySellStack {
    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Iterate through each day as buy day
        for (int i = 0; i < prices.length; i++) {
            // Iterate through each day after the buy day as sell day
            for (int j = i + 1; j < prices.length; j++) {
                // Calculate the profit by selling on the jth day after buying on ith day
                int profit = prices[j] - prices[i];
                // Update maxProfit if this profit is greater than seen before
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
