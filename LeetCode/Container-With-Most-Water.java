1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6        while(left < right) {
7            int currentArea = Math.min(height[left], height[right]) * (right - left);
8            maxArea = Math.max(maxArea, currentArea);
9//recode
10//
11//
12            if(height[left] < height[right]){
13                left++;
14            } else{
15                      right--;
16            }
17        }
18        
19
20        return maxArea;
21    }
22}