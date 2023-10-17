/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pathsum;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        // Use the Solution class to check if there is a path with the target sum
        Solution solution = new Solution();
        boolean hasPath = solution.hasPathSum(root, targetSum);

        // Print the result
        if (hasPath) {
            System.out.println("There is a root-to-leaf path with the target sum.");
        } else {
            System.out.println("No root-to-leaf path with the target sum exists.");
        }
    }
}
