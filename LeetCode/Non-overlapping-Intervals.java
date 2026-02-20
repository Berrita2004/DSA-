1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int n = intervals.length;
4        //sort by end time , inc 
5        Arrays.sort(intervals ,(a,b)-> a[1]-b[1]);
6        int cnt = 1;
7        int lastEnd = intervals[0][1];
8        //compare start to lastEnd 
9        for(int i = 1 ; i < n; i++){
10            if(intervals[i][0]>=lastEnd){
11                cnt++;
12                //change the end 
13                lastEnd= intervals[i][1];
14            }
15        }
16    //now for min intervals , n - cnt , i messed up here 
17        return n-cnt;
18    }
19}