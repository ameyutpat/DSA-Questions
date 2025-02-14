package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class StockBuyAndSale {
    public static void main(String[] args) {
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        int maxProfit = findMaxProfitWithLessTC(prices);
        System.out.println("Max profit of given prices: "+maxProfit);
    }

    private static int findMaxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i < prices.length-1;i++){
            for(int j=i+1;j < prices.length;j++){
                int currentSalePrice = prices[j] - prices[i];
                if(currentSalePrice > maxProfit){
                    maxProfit = currentSalePrice;
                }
            }
        }
        return maxProfit;
    }

    private static int findMaxProfitWithLessTC(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        int leastSoFar = Integer.MAX_VALUE;
        for(int i=0; i < prices.length;i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            currentProfit = prices[i] - leastSoFar;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
