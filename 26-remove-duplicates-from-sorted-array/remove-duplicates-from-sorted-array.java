class Solution {
    public int removeDuplicates(int[] nums) {
        int n  = nums.length;
        int h = 0 ;
        for ( int i = 1 ; i < n ; i ++){
            if (nums[i]!= nums[h]){
                nums[h+1]= nums[i];
                h++;
            }
        }
        return (h +1 );
    }
}