/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.besttimetobuysellstock;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Replace this array with your stock prices.

        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
