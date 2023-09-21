/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.plusone;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]  digits= {-1,2,3};
        digits = solution.plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
}
