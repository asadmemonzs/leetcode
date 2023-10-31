/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.validpalindrome;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama"; // Replace this with your input string.

        Solution solution = new Solution();
        boolean isPalindrome = solution.isPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}