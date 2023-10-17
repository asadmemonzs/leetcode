/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pathsum;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false; // An empty tree has no path sum.
        }
        
        // Check if it's a leaf node with the correct target sum.
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        
        // Recursively check the left and right subtrees with updated target sums.
        boolean leftPath = hasPathSum(root.left, targetSum - root.val);
        boolean rightPath = hasPathSum(root.right, targetSum - root.val);
        
        return leftPath || rightPath; // Return true if either subtree has a path sum.
    }
}
