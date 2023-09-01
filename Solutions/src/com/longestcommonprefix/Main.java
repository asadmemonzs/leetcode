package com.longestcommonprefix;

/**
 *
 * @author ShahJE
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"cir","car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
