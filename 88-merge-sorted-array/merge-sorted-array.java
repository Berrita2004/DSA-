class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int gap = (length / 2) + (length % 2);

        // Copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < length) {
                if (nums1[left] > nums1[right]) {
                    // Swap if out of order
                    int temp = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = temp;
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
