class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarrayWithSumLessThanGoal(nums , goal) - numSubarrayWithSumLessThanGoal(nums, goal-1);
    }
    public int numSubarrayWithSumLessThanGoal(int[] nums ,int goal){
        if (goal < 0) return 0;
        int n = nums.length;
        int l = 0 ;
        int r = 0 ;
        int sum = 0 ;
        int cnt = 0 ;
        while(r<n){
            sum += nums[r];
            while(sum>goal){
                sum -= nums[l];
                l++;
            }
            cnt += r-l+1;
            r++;
        }
        return cnt;
    }

}