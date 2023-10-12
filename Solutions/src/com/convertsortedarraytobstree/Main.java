/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.convertsortedarraytobstree;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        // Use the Solution class to convert the sorted array to a balanced BST.
        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayToBST(sortedArray);

        // You can add code to print or visualize the resulting tree if needed.
    }
}
