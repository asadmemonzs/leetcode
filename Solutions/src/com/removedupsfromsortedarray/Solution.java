/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.removedupsfromsortedarray;

/**
 *
 * @author asadmemonzs
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i]; 
                nums[uniqueCount] = current; 
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}