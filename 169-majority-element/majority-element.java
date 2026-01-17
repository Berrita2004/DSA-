class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0 ;
        int cnt = 0 ;

        for (int i = 0 ; i < n ; i++){
            if ( cnt == 0 ){
                cnt = 1;
                candidate = nums[i];
            }
            else if (candidate== nums[i]){
                cnt++;
            }
            else cnt--;
        }
        int check = 0 ;
        for ( int i = 0 ; i < n ; i ++){
            if (candidate == nums[i]){
                check++;
            }
        }
        
        if (check > n/2){
            return candidate;
        }
        return -1;
    }
}