class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int r = 0 ; 
        int n = nums.length;
        int l = 0; 
        int cnt = 0 ;
         int sum = 0 ;
        HashMap <Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        while(r < n){
           
            sum += nums[r];
            cnt += mpp.getOrDefault(sum - goal , 0);
            mpp.put(sum ,mpp.getOrDefault(sum, 0) +1);
            r++;
        }
        return cnt;
    }
}