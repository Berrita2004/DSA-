import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n subsets
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Check if j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            ans.add(subset);
        }
        
        return ans;
    }
}
