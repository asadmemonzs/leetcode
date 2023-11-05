/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binarytreepreordertraversal;

/**
 *
 * @author asadmemonzs
 */
import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalRecursive(root, result);
        return result;
    }

    private void preorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val); // Process the current node
        preorderTraversalRecursive(node.left, result); // Recursively traverse the left subtree
        preorderTraversalRecursive(node.right, result); // Recursively traverse the right subtree
    }
}
