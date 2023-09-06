package com.validparanthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author asadmemonzs
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMapping = new HashMap<>();
        bracketMapping.put(')', '(');
        bracketMapping.put('}', '{');
        bracketMapping.put(']', '[');
        for (char c : s.toCharArray()) {
            if (bracketMapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
