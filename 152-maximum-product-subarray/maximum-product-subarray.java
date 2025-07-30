class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ms = Integer.MIN_VALUE ;
      
        for ( int i = 0 ; i < n ; i ++ ){
              int cs = 1 ;
            for ( int j = i ; j < n ; j ++){
                cs *= nums[j];

                   ms = Math.max(ms, cs );
            }
              
        }
  
      return ms ;  
    }
}