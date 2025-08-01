package org.com.challenges.arrays.easy;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > profit) {
                profit = price - minPrice;
            }
        }
        return profit;
    }
}
