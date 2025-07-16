class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];  // no need for long[]
        int left = 0;  // pointer for nums1
        int right = 0; // pointer for nums2
        int index = 0; // pointer for arr

        // merge elements into arr
        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                arr[index++] = nums1[left++];
            } else {
                arr[index++] = nums2[right++];
            }
        }

        // if anything left in nums1
        while (left < m) {
            arr[index++] = nums1[left++];
        }

        // if anything left in nums2
        while (right < n) {
            arr[index++] = nums2[right++];
        }

        // copy back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
