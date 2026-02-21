1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> res = new ArrayList<>();
4        //tc and sc = o(N), O(N)
5        int n = intervals.length;
6        int i = 0 ;
7        while ( i < n && intervals[i][1]< newInterval[0]){
8            res.add(intervals[i]);
9            i++;
10        }
11        while (i <n &&intervals[i][0]<= newInterval[1] ){
12            newInterval [0]= Math.min (newInterval[0], intervals[i][0]);
13            newInterval [1] = Math.max (newInterval[1], intervals[i][1]);
14            i++;
15        }
16        res.add(newInterval);
17        while (i < n){
18            res.add(intervals[i]);
19            i++;
20        }
21        return res.toArray(new int [res.size()][]);
22    }
23}