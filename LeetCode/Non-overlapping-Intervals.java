1class Solution {
2    //tc +> N(logN)+N
3    //sc = O(1)
4    public int eraseOverlapIntervals(int[][] intervals) {
5        int n = intervals.length;
6        //sort by end time , inc 
7        Arrays.sort(intervals ,(a,b)-> a[1]-b[1]);
8        int cnt = 1;
9        int lastEnd = intervals[0][1];
10        //compare start to lastEnd 
11        for(int i = 1 ; i < n; i++){
12            if(intervals[i][0]>=lastEnd){
13                cnt++;
14                //change the end 
15                lastEnd= intervals[i][1];
16            }
17        }
18    //now for min intervals , n - cnt , i messed up here 
19        return n-cnt;
20    }
21}