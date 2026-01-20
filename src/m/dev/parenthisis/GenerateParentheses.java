package m.dev.parenthisis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string is of the maximum length, add it to the result
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        // If we can add an open parenthesis, do so
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        // If we can add a close parenthesis, do so
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    public static void main(String[] args) {
        int n = 3; // Example for 3 pairs of parentheses
        List<String> parentheses = generateParentheses(n);
        System.out.println("Generated Parentheses: " + parentheses);
    }
}
