package com.dev.practice.sevntyfive;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int [] shares={7,1,5,3,6,4};
        System.out.println(solution(shares));
    }
    //TC==O(N) SC==O(1)
    private static int solution(int[] price) {
        int n=price.length;
        int max_profit=0;
        int buy_price=price[0];
        for(int i=1;i<n;i++){
            int curret_profit=price[i]-buy_price;
            if(curret_profit>max_profit){
                max_profit=curret_profit;
            }
            if(price[i]<buy_price){
                buy_price=price[i];
            }
        }
        return max_profit;
    }
}
