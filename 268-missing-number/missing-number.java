class Solution {
    public int missingNumber(int[] nums){
   int n = nums.length;
        Arrays.sort(nums);

        // Check if 0 is missing at the start
        if (nums[0] != 0) return 0;

        // Check if n is missing at the end
        if (nums[n - 1] != n) return n;

        // Check in the sorted array for the missing number
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }

        // This return won't be reached, but needed for compilation
        return -1;
    }
}