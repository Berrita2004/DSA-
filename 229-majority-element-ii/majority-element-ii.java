class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++){
           int count = 0 ; 
            if (ans.contains(nums[i])) continue;
           for ( int j = 0 ; j < n ; j ++){
            if (nums[j]==nums[i]){
                count ++;
            }
            
           }
              if (count > (n/3)){
            ans.add(nums[i]);
             if (ans.size() == 2) break;
         }
  
        }
        return ans;
       
}
}