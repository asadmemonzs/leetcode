/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asadmemonzs
 */
public class Main {
    public static void main(String[] args) {
        int numRows = 5; // Change this value to generate a different number of rows.

        Solution solution = new Solution();
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);

        // Print the result
        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}
