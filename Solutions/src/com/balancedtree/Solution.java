/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balancedtree;

/**
 *
 * @author asadmemonzs
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is balanced.
        }
        
        // Check if both left and right subtrees are balanced and their height difference is at most 1.
        return isBalancedHelper(root) != -1;
    }

    private int isBalancedHelper(TreeNode node) {
        if (node == null) {
            return 0; // The height of an empty tree is 0.
        }

        // Recursively calculate the heights of the left and right subtrees.
        int leftHeight = isBalancedHelper(node.left);
        int rightHeight = isBalancedHelper(node.right);

        // If any subtree is unbalanced or the height difference is more than 1, return -1.
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return the height of the current subtree.
        return Math.max(leftHeight, rightHeight) + 1;
    }
}