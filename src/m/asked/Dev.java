package m.asked;

import java.util.Stack;

public class Dev {
    public static void main(String[] args) {
        System.out.println(isBalanced("{}{}{"));  // Output: false
        System.out.println(isBalanced("{}{}{}"));  // Output: true
        //System.out.println(isBalanced("{"));  // Output: false
        //System.out.println(isBalanced("}"));  // Output: false
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                stack.push(ch);  // Push the opening brace onto the stack
            } else if (ch == '}') {
                if (stack.isEmpty()) {
                    return false;  // No matching opening brace
                }
                stack.pop();  // Pop the matching opening brace
            }
        }
        return stack.isEmpty();  // If the stack is empty, braces are balanced
    }
}
