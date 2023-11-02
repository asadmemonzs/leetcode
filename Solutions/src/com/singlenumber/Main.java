/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.singlenumber;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Replace this with your input array.

        Solution solution = new Solution();
        int singleNumber = solution.singleNumber(nums);

        System.out.println("The single number is: " + singleNumber);
    }
}
