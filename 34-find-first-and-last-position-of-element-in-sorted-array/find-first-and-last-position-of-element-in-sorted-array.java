class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int [] ans = new int [2];
        ans [0] = -1;
        ans [1] = -1;
        firstIdx(nums,n, target, ans );
        lastIdx(nums,n , target, ans );
        return ans ;
    }

        public void firstIdx(int [] nums,int  n ,int target, int [] ans ){
            int low = 0 ; int high = n-1;
        while ( low <= high){
            int mid = (low + high )/2;
            if (nums[mid]==target){
                ans [0]= mid;
                high = mid -1 ;
            }
            else if (nums[mid]<target){
                low = mid+1;
            }
            else {
                high = mid - 1;
                }
            }
            
        }
           public void lastIdx(int [] nums,int  n ,int target, int [] ans ){
            int low = 0 ; int high = n-1;
        while ( low <= high){
            int mid = (low + high )/2;
            if (nums[mid]==target){
                ans [1] = mid;
                
                low = mid+1;
            }
            else if (nums[mid]<target){
                 low = mid+1;
                
            }
            else {
               
               high = mid -1 ;
                }
            }
        }
     
}