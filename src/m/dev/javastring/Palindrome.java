package m.dev.javastring;

public class Palindrome {
    public static void main(String[] args) {
        String input = "level"; // Example input
        //String normalizedStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //System.out.println(normalizedStr);
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left<right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}
