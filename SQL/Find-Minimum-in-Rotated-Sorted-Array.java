1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int min = Integer.MAX_VALUE;
5        int high = n-1 ; 
6        int low = 0 ;
7
8        while ( low <= high){
9            int mid = (low + high)/2;
10            if (nums[low]<= nums[mid]){
11                min = Math.min(min, nums[low]);
12                low = mid + 1;
13            }
14            else {
15                min = Math.min(min, nums[mid]);
16                high = mid -1 ;
17            }
18        }
19        return min;
20    }// recoded
21}