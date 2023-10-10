/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.symmetrictree;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Create a sample symmetric binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));

        // Use the Solution class to check if the tree is symmetric
        Solution solution = new Solution();
        boolean isSymmetric = solution.isSymmetric(root);

        // Print the result
        if (isSymmetric) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
    }
}
