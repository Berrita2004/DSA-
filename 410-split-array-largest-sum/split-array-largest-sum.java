class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length ;
        int low = Integer.MIN_VALUE ;
        int high = 0 ; 
        for ( int i = 0 ; i < n ;i ++){
            low = Math.max(low ,nums[i]);
            high += nums[i];
        }
        while ( low <= high ){
            int mid = (low + high)/2 ; 
            int add = Addition (nums, mid );
            if (add> k){
                low = mid +1;
            }
            else {
                high = mid -1 ;
            }
        }
        return low;
    }
    public static int Addition(int[]nums, int mid ){
        int p = 0 ; 
        int s= 1;
        for ( int i = 0 ; i<nums.length ;i++){
            if (p+nums[i]<=mid){
                p+=nums[i];
            }
            else{
                s++;
                p = nums[i];
            }
        }
        return s ; 
    }
}