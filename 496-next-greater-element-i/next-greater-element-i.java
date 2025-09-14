class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            ans[i] = -1; // default if no greater element
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == nums1[i]) {
                    // start looking for next greater after nums2[j]
                    found = true;
                }
                if (found && j < n2 && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}
