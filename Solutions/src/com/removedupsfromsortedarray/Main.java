/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.removedupsfromsortedarray;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3}; 
        int[] expectedNums = {1,2,3};

        int k = new Solution().removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
