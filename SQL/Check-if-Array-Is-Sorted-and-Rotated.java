1class Solution {
2    public boolean check(int[] nums) {
3        int cnt = 0 ;
4        for (int i = 1 ; i < nums.length; i ++){
5            if ( nums[i] < nums[i-1]){
6                cnt++;
7            }
8        }
9        if (nums[nums.length-1] > nums[0]) cnt++;
10        if (cnt <= 1){
11            return true;
12
13        }
14    return false ;
15    }
16}