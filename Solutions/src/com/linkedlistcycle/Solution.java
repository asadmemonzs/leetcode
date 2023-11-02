/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linkedlistcycle;

/**
 *
 * @author asadmemonzs
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // An empty list or a list with only one node can't have a cycle.
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move the slow pointer one step.
            fast = fast.next.next; // Move the fast pointer two steps.
            
            if (slow == fast) {
                return true; // If the two pointers meet, there is a cycle.
            }
        }
        
        return false; // If the fast pointer reaches the end, there is no cycle.
    }
}
