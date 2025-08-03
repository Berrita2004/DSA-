class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int pre = 0 ;
        int suf = 0 ; 
        for ( int i = 0 ; i < n ; i++){
            if (pre==0) pre = 1;
            if ( suf == 0) suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[n-i-1];
            max = Math.max(max, Math.max(suf, pre));
        } 
        return max ; 
        
    }
}