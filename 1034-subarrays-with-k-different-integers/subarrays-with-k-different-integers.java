class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums , (k-1));
    }
    public int atmost(int[] nums, int k ){
        int l = 0 ;
        int cnt = 0 ;
        HashMap <Integer, Integer> map = new HashMap<>();

        for ( int r = 0 ; r < nums.length; r++){
            // ye nums[r] ko add to the window karta hai 
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            // If this number is NEW (freq becomes 1), one distinct reduces
            if(map.get(nums[r])== 1){
                k--;
            }
            //agar k distinct more hai 0 se 
              while(k<0){
            map.put(nums[l], map.get(nums[l])-1); //frequency-- 
            if(map.get(nums[l])==0){
                k++;
            }
            l++;
        }
         cnt += (r-l+1);
        }

      return cnt;
       

    }
}