class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // Edge cases
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // If slope is going up → move right
            if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            }
            // Else slope is going down → move left
            else {
                high = mid - 1;
            }
        }

        // Shouldn't happen if array has at least one peak
        return -1;
    }
}
