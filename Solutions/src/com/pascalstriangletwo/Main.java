/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pascalstriangletwo;

/**
 *
 * @author asadmemonzs
 */

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int rowIndex = 3; // Change this to the desired row index
        List<Integer> row = solution.getRow(rowIndex);
        
        System.out.print("Row " + rowIndex + " of Pascal's triangle: ");
        for (int num : row) {
            System.out.print(num + " ");
        }
    }
}
