class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ; 
        int r = 0 ;
        int zero = 0 ;
        int n = nums.length;
        int maxLen = Integer.MIN_VALUE;
        while ( r < n){
            if ( nums[r] == 0  ) zero ++;
            if  ( zero > k){
               if (nums[l] == 0) zero--;
               l++;
            } 
            if (zero <= k ){
               int  len = r - l +1 ;
                maxLen = Math.max(maxLen, len);
            }
            r++;
        }
        return maxLen;
    }
}