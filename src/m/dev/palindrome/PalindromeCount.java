package m.dev.palindrome;

public class PalindromeCount {
    public static void main(String[] args) {
        String input = "abba"; // Example input
        int palindromeCount = countPalindromicSubstrings(input);
        System.out.println("The number of palindromic substrings in \"" + input + "\" is: " + palindromeCount);
    }
    private static int countPalindromicSubstrings(String s) {
        // Method to count palindromic substrings
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                // Count odd length palindromes
                count += expandAroundCenter(s, i, i);
                // Count even length palindromes
                count += expandAroundCenter(s, i, i + 1);
            }
            return count;
       // }
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; // Found a palindrome
            left--;   // Expand to the left
            right++;  // Expand to the right
        }
        return count;
    }
}
