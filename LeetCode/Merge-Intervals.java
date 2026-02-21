1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        int n = intervals.length;
6        if (n == 0) return intervals;
7
8        // Step 1: Sort intervals by start time
9        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
10
11        List<int[]> merged = new ArrayList<>();
12
13        // Step 2: Iterate over intervals
14        for (int i = 0; i < n; i++) {
15            int start = intervals[i][0];
16            int end =    intervals[i][1];
17
18            // Step 3: Merge all overlapping intervals with intervals[i]
19            int j = i + 1;
20            while (j < n && intervals[j][0] <= end) {
21                // Update the end if overlapping interval extends further
22                end = Math.max(end, intervals[j][1]);
23                j++;
24            }
25
26            // Step 4: Add the merged interval to the result list
27            merged.add(new int[]{start, end});
28
29            // Step 5: Skip the intervals that were merged
30            i = j - 1;
31        }
32
33        // Step 6: Convert the list to an array and return
34        return merged.toArray(new int[merged.size()][]);
35    }
36}
37