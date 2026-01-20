package m.dev.array;

import java.util.HashMap;

public class IdenticalCharacterCount {
    public static void main(String[] args) {
        String str1 = "entsil";
        String str2 = "silent";
        if (haveIdenticalCharacterCounts(str1, str2)) {
            System.out.println("The strings have identical character counts.");
        } else {
            System.out.println("The strings do not have identical character counts.");
        }
    }

    private static boolean haveIdenticalCharacterCounts(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, they can't have identical counts
        }
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // Count characters in the first string
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Decrease count based on the second string
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // Character in str2 not found in str1
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) < 0) {
                return false; // More occurrences in str2 than in str1
            }
        }
        return true;
    }

}
