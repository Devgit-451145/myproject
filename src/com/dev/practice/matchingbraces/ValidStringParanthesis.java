package com.dev.practice.matchingbraces;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidStringParanthesis {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("a(b(cd"));
    }
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> remove = new HashSet<>();
        // First pass: identify invalid parentheses
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            }
            else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();  // matched
                } else {
                    remove.add(i); // extra ')'
                }
            }
        }
        // Any remaining '(' are invalid
        while (!stack.isEmpty()) {
            remove.add(stack.pop());
        }
        // Build result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove.contains(i)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
