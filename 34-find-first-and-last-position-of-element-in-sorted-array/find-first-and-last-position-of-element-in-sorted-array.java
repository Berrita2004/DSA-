class Solution { 
    // re-coding 
    // revison 
    public int[] searchRange(int[] nums, int target) {
     int n = nums.length;
     int[] res = new int[2];
     res[0] = firstIdx(nums,target,n);
     res[1] = secIdx(nums,target,n);
     return res;
    }
    public int firstIdx(int[]nums, int target, int n ){
       int low = 0 ;
       int high = n-1;
       int ans = -1 ; 
       while(low <= high ){
        int mid = (low + high)/2 ;
        if (nums[mid]== target ){
             ans = mid;
            high = mid -1;
        }
        else if (nums[mid]<target){
            low = mid + 1 ;
        }
        else  high = mid -1;
        
       }
       return ans ;
    }
      public int secIdx(int[]nums, int target, int n ){
       int low = 0 ;
       int high = n-1;
       int ans = -1 ;
       while(low <= high ){
        int mid = (low + high)/2 ;
        if (nums[mid]== target ){
             ans = mid;
            low = mid + 1 ;
        }
        else if(nums[mid]<target){
           low = mid +1;
        }
        else high = mid -1;
        
       }
       return ans ;
    }

}