1class Solution {
2    public int hammingDistance(int x, int y) {
3        int cnt = 0 ;
4        int ans = x ^ y;
5        for (int i = 0 ; i < 32; i ++){
6            if((ans & (1<<i)) != 0){
7                cnt ++;
8            }
9        }
10        return cnt++;
11    }
12}