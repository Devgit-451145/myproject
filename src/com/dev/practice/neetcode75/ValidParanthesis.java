package com.dev.practice.neetcode75;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        //String s = "[(])";
        String s = "([{}])";
        System.out.println(solu(s));
        System.out.println(solu1(s));

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
