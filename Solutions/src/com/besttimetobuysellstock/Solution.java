/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.besttimetobuysellstock;

/**
 *
 * @author asadmemonzs
 */
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int potentialProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        
        return maxProfit;
    }
}
