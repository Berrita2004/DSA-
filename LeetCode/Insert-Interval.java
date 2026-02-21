1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> res = new ArrayList<>();
4        int n = intervals.length;
5        int i = 0 ;
6        while ( i < n && intervals[i][1]< newInterval[0]){
7            res.add(intervals[i]);
8            i++;
9        }
10        while (i <n &&intervals[i][0]<= newInterval[1] ){
11            newInterval [0]= Math.min (newInterval[0], intervals[i][0]);
12            newInterval [1] = Math.max (newInterval[1], intervals[i][1]);
13            i++;
14        }
15        res.add(newInterval);
16        while (i < n){
17            res.add(intervals[i]);
18            i++;
19        }
20        return res.toArray(new int [res.size()][]);
21    }
22}