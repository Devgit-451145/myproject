package m.dev.parenthisis;

import java.util.Stack;

public class ValidParanthisys {
    public static void main(String[] args) {
        System.out.println(isValid("()"));           // Output: true
        System.out.println(isValid("()[]{}"));       // Output: true
        System.out.println(isValid("(]"));           // Output: false
        System.out.println(isValid("([)]"));         // Output: false
        System.out.println(isValid("{[]}"));         // Output: true
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for matching closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatched pair
                }
            }
        }
        // The stack should be empty if all brackets are matched
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}
