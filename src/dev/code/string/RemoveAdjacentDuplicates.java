package dev.code.string;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "abbaca"; //output ca
        String result = removeDuplicates(input);
        System.out.println(result);
    }
    private static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int length = stack.length();
            if (length > 0 && stack.charAt(length - 1) == c) {
                stack.deleteCharAt(length - 1); // Remove the last character
            } else {
                stack.append(c); // Add current character
            }
        }

        return stack.toString();
    }
}
