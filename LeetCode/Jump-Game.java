1class Solution {
2    public boolean canJump(int[] nums) {
3        //i think we should just go for the highest jum whereever we are 
4        int maxReach = 0 ;
5        for ( int i =0 ; i < nums.length; i ++){
6            
7            if(i>maxReach){
8                return false ;
9            }
10            maxReach = Math.max(maxReach , i + nums[i]);
11        }
12        return true;
13        //tc= O(n)
14        //sc = O(1)
15    }
16}