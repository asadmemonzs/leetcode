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
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) {
            return result; // Return an empty list for non-positive input.
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                // The first row starts with 1.
                row.add(1);
            } else {
                List<Integer> prevRow = result.get(i - 1);
                row.add(1); // The first element in each row is always 1.
                for (int j = 1; j < i; j++) {
                    // Calculate the middle elements in each row as the sum of the two elements above them.
                    int value = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(value);
                }
                row.add(1); // The last element in each row is always 1.
            }
            result.add(row);
        }

        return result;
    }
}
