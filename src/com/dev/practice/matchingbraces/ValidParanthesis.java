package com.dev.practice.matchingbraces;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        //String s = "[(])";
        String s = "([{}])";
        System.out.println(solu(s));
        System.out.println(solu1(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            
            // Handle closing brackets
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    //o(n) both
    private static boolean solu1(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c:s.toCharArray()) {
            if(map.containsKey(c)) {
               if(!stack.isEmpty() && stack.peek() == map.get(c)) {
                   stack.pop();
               } else {
                   return false;
               }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
     //o[n2] sc=o[n]
    private static boolean solu(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}
