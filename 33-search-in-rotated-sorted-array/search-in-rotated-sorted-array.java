class Solution {
    public int search(int[] nums, int target) {
     int st = 0 ; 
     int n = nums.length;
     int ed = n-1;
    
     while (st <= ed){
        int mid = st + (ed-st)/2;
        if ( nums[mid]== target){
            return  mid;
        }
        if (nums[st]<= nums[mid]){
          if(nums[st] <= target && target <= nums[mid] ){
            ed = mid-1;
          }   
          else st = mid +1;
        }
        else {
           if (nums[mid]<=nums[ed]){
             if (nums[mid]<= target && target <= nums[ed]){
                st = mid +1 ;
             }
             else {
                ed = mid -1 ;
             }

        }

        }
     
     }
     return -1 ;

    }
}