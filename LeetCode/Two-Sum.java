1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap <Integer,Integer> map = new HashMap<>();
4        int m = nums.length;
5        int n = 0 ;
6        while (n < m ){
7            int diff = target - nums[n];
8            if(map.containsKey(diff)){
9                return new int[] {map.get(diff), n};
10            }
11            map.put(nums[n], n);
12            n++;
13        }
14        return new int[2];
15    }
16}