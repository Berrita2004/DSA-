1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap <Integer,Integer> map = new HashMap<>();
4        int n = nums.length;
5        int m = 0 ;
6        while (n > m ){
7            int diff = target - nums[m];
8            if(map.containsKey(diff)){
9                return new int[] {map.get(diff), m};
10            }
11            map.put(nums[m], m);
12            m++;
13        }
14        return new int[2];
15    }
16}
17//i forgot what i did again 
18//with parthvi 
19