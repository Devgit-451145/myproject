package m.asked;

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add to list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        int[][] input = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] output = merge(input);
        System.out.println("Merged Intervals:");
        for (int[] interval : output) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

