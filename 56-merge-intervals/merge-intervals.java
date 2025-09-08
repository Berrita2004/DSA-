import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Step 2: Iterate over intervals
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end =    intervals[i][1];

            // Step 3: Merge all overlapping intervals with intervals[i]
            int j = i + 1;
            while (j < n && intervals[j][0] <= end) {
                // Update the end if overlapping interval extends further
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            // Step 4: Add the merged interval to the result list
            merged.add(new int[]{start, end});

            // Step 5: Skip the intervals that were merged
            i = j - 1;
        }

        // Step 6: Convert the list to an array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
