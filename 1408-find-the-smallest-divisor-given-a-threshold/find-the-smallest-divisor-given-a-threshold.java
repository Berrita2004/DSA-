class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < nums.length; i++){
            max = Math.max(max , nums[i]);
        }
        int low = 1 ;
        int high = max ; 
        while (low <= high){
            int mid = (low + high)/2 ;
            int div = findDiv(nums,threshold, mid);
            if (div <= threshold){
                high = mid -1 ;
            }
            else {
                low = mid +1 ;
            }
        } 
        return low ;
    }
    public static int findDiv(int[]nums, int threshold, int mid){
        int sum = 0 ; 
        for ( int i = 0 ; i<nums.length;i ++){
            sum+= (nums[i]+ mid -1)/mid;
        }
        return sum;
    }
}