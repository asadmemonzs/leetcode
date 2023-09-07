/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sortedlistmerge;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(list1, list2).next.next.next.val);
    }
}
