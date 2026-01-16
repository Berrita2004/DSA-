class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int m = nums.length;
        int n = 0 ;
        while (n < m ){
            int diff = target - nums[n];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), n};
            }
            map.put(nums[n], n);
            n++;
        }
        return new int[2];
    }
}