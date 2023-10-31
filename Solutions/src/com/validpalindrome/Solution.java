/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.validpalindrome;

/**
 *
 * @author asadmemonzs
 */
class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert the string to lowercase.
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // The string is not a palindrome.
            }
            left++;
            right--;
        }
        
        return true; // The string is a palindrome.
    }
}