/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sametree;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // Both trees are empty, so they are the same.
        }
        if (p == null || q == null) {
            return false; // One tree is empty while the other is not, so they are not the same.
        }
        if (p.val != q.val) {
            return false; // Values of the current nodes are different, so they are not the same.
        }
        
        // Recursively check the left and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

