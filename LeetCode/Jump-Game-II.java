1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        int edge = 0;// current jump limit
5        int jump =0 ;
6        int maxReach = 0; 
7        for (int i = 0; i < n - 1; i++) {
8            maxReach = Math.max(maxReach, i + nums[i]);
9
10            // If we have reached the end of current jump range
11            if (i == edge) {
12                jump++;
13                edge = maxReach;
14            }
15        }
16        return jump;
17    }
18}