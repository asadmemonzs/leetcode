/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minimumdepthofbinarytree;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Use the Solution class to find the minimum depth
        Solution solution = new Solution();
        int minDepth = solution.minDepth(root);

        // Print the result
        System.out.println("Minimum Depth: " + minDepth);
    }
}
