/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.symmetrictree;

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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric.
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // Both subtrees are empty, so they are symmetric.
        }
        if (left == null || right == null) {
            return false; // One subtree is empty while the other is not, so they are not symmetric.
        }
        if (left.val != right.val) {
            return false; // Values of the current nodes are different, so they are not symmetric.
        }
        
        // Recursively check if the left subtree of the left tree is a mirror of the right subtree of the right tree, and vice versa.
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
