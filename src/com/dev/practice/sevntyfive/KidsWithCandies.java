package com.dev.practice.sevntyfive;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
        // Output: [true, true, true, false, true]
    }
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum number of candies
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int c : candies) {
            maxCandies = Math.max(maxCandies, c);
        }
        // Step 2: Determine if each kid can have the greatest number
        for (int c : candies) {
            result.add(c + extraCandies >= maxCandies);
        }
        return result;
    }
}
