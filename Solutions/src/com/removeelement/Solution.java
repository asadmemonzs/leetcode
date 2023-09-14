/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.removeelement;

/**
 *
 * @author asadmemonzs
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the count of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, we keep it in the array
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Increment k to count the non-val elements
            }
        }

        // At this point, the first k elements of nums are non-val elements
        return k;
    }

}
