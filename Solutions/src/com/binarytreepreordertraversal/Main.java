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

public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}
