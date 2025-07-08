class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length; 
        
    if (n == 0) return 0;
        Arrays.sort (nums );
        int small = Integer.MIN_VALUE ; 
        int count = 0 ; 
        int maxCount = 1;
        for ( int i = 0 ; i < n ; i ++){
           if (nums[i] == small) {
    continue;  // skip duplicates
} else if (nums[i] - 1 == small) {
    count++;
} else {
    count = 1;
}
small = nums[i];  
            maxCount = Math.max(maxCount ,count )      ;
        }
        return maxCount;
    }
}