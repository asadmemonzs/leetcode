/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deleteduplicatesfromlinkedlist;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        // Create a sorted linked list for testing
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node3Dup = new ListNode(3, node3);
        ListNode node2 = new ListNode(2, node3Dup);
        ListNode node1 = new ListNode(1, node2);
        
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(node1);
        
        // Print the result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
