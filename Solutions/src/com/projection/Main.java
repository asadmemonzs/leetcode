/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projection;

/**
 *
 * @author ShahJE
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,0},{0,2}};
          //int[][] grid = {{2}};
          //int[][] grid = {{1,2},{3,4}};
//          int[][] grid = {{1,2,1},{2,1,1},{2,0,4}};
        System.out.println(solution.projectionArea(grid));

//            int[] one = {2,1,0};
//            System.out.println(solution.max(one));
        
        //int[] arr= {5,7,8,2,1,6};
        //int[] arr= {5,7,8,2,10,6};
        //int[] arr= {5};
//        int[] arr= {};
//        System.out.println(solution.max(arr));
    }
}
