/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.removeelement;

import java.util.Arrays;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Input array
        int[] nums = {3, 2, 2, 3, 4, 5, 2};
        int val = 2;

        // Expected answer with correct length
        int[] expectedNums = {3, 3, 4, 5};

        // Call the removeElement function
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        // Ensure that the first k elements are sorted and match the expectedNums
        Arrays.sort(nums, 0, k);

        // Check if k is equal to the length of expectedNums
        assert k == expectedNums.length;

        // Check if the first k elements of nums match the expectedNums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        // Print the result
        System.out.println("Modified Array: " + Arrays.toString(nums));
        System.out.println("Number of elements not equal to " + val + ": " + k);
    }
}
