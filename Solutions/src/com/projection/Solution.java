/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projection;

/**
 *
 * @author ShahJE
 */
public class Solution {
    public int projectionArea(int[][] grid) {
        int count= 0;
        int countm = 0;
        int[][] newgr = new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 0){
                    countm++;
                }
                newgr[j][i] = grid[i][j];
            }
        }
        
        for (int i = 0; i < grid.length; i++) {
            count+= grid[i].length;
            count+= grid[i][max(grid[i])];
            count+= newgr[i][max(newgr[i])];
        }
        
        count-= countm;
     
        return count;
    }
    
    public int max(int[] arr){
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
        }
        return maxIndex;
    }
    
    public void printGrid(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+",");
            }
            System.out.println("");
        }
    
    }
}
