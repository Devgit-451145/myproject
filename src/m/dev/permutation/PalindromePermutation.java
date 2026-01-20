package m.dev.permutation;

import java.util.HashMap;
import java.util.HashSet;

public class PalindromePermutation {
    public static void main(String[] args) {
            System.out.println(canPermutePalindrome("tactcoa"));  // Output: true
            System.out.println(canPermutePalindrome("Not a palindrome"));  // Output: false
    }
    public static boolean isPermutationOfPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll(" ", "").toLowerCase();
        // Count character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Check how many characters have an odd count
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        // A permutation of a palindrome can have at most one odd character count
        return oddCount <= 1;
    }
    //appraocj 2
    public static boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.size() <= 1;
    }
}
