package com.dev.practice.neetcode75;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int [] nums={10,1,5,6,7,1};
        System.out.println(solution1(nums));
        System.out.println(solution2(nums));
        System.out.println(solution3(nums));
    }

    private static int solution3(int[] prices) {
        int maxProfit=0;
        for(int i=0;i<prices.length;i++) {
            for(int j=i+1;j<prices.length;j++) {
                int profit=prices[j]-prices[i];
                if(profit>maxProfit) {
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }

    //o(n)  sc==o(1)
    private static int solution2(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int buyPrice=prices[0];
        for(int i=1;i<n;i++) {
            int curr_price=prices[i]-buyPrice;
            if(curr_price>maxProfit) {
                maxProfit=curr_price;
            }
            if(prices[i]<buyPrice) {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    //Time complexity:O(n2) sc=O(1)
    private static int solution1(int[] price) {
        int bestPrice=0;
        for(int i=0;i<price.length;i++) {
            int buy=price[i];
            for(int j=i+1;j<price.length;j++) {
                int sell=price[j];
                bestPrice=Math.max(bestPrice,sell-buy);
                //System.out.println(bestPrice);
            }
        }
        return bestPrice;
    }
}
