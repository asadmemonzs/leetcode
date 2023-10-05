/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mergesortedarray;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;
        int m = 3;
        
        int[] nums2 = {2, 4, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
