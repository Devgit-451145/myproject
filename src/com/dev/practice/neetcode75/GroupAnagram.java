package com.dev.practice.neetcode75;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store the list of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String word : strs) {
            // Convert the word to an array of characters
            char[] charArray = word.toCharArray();
            // Sort the array
            Arrays.sort(charArray);
            // Convert back to string
            String sortedWord = new String(charArray);
            // If the sorted word is not in the map, add it with an empty list
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            // Append the original word to the corresponding list
            anagramMap.get(sortedWord).add(word);
        }
        // Return the grouped list of anagrams
        return new ArrayList<>(anagramMap.values());
    }
}
