/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sametree;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Create two sample binary trees
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Use the Solution class to check if the trees are the same
        Solution solution = new Solution();
        boolean areSame = solution.isSameTree(p, q);

        // Print the result
        if (areSame) {
            System.out.println("The trees are the same.");
        } else {
            System.out.println("The trees are not the same.");
        }
    }
}
