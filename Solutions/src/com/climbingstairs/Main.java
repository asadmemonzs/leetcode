/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.climbingstairs;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2; 
        int ways = solution.climbStairs(n);
        System.out.println("Distinct ways to climb to the top with " + n + " steps: " + ways);
    }
}
