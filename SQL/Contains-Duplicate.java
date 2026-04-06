1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3       HashSet sh = new HashSet<>();
4       for(int i = 0 ; i < nums.length; i++){
5
6        if (sh.contains(nums[i])){
7            return true;
8        }
9        sh.add(nums[i]);
10       }
11       return false;
12    }
13}