package com.dev.practice.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        //Deque as stack
        Deque<Integer> stack=new ArrayDeque<>();
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        System.out.println(stack);
        System.out.println(stack.peek());//view element
        System.out.println(stack.pop()); //remove
        System.out.println(stack);
        System.out.println(stack.peek());

        //Deque as queue
        Deque<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("q-----"+queue);
        queue.poll();
        System.out.println("q-----"+queue);
        System.out.println(queue.peek());

        //reverse string using dequu
        reverseString("java");
        //check palindrome
        palidrome("madam");

    }

    private static void palidrome(String s) {
        Deque<Character> dq=new ArrayDeque<>();
        for(char c:s.toCharArray()) {
            dq.addLast(c);
        }
        boolean isPalindrome =true;
        while (dq.size()>1) {
            if(dq.pollFirst()!=dq.pollLast()) {
                isPalindrome=false;
                break;
            }
        }
    }

    private static void reverseString(String s) {
        Deque<Character> dq=new ArrayDeque<>();
        for(char c:s.toCharArray()) {
            dq.push(c);
        }
        while(!dq.isEmpty()) {
            System.out.print(dq.pop()+"--");
        }
    }
}
