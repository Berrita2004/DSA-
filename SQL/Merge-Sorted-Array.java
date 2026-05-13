1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int length = m + n;
4        int gap = (length / 2) + (length % 2);
5
6        // Copy nums2 into nums1
7        for (int i = 0; i < n; i++) {
8            nums1[m + i] = nums2[i];
9        }
10 
11        while (gap > 0) {
12            int left = 0;
13            int right = left + gap;
14
15            while (right < length) {
16                if (nums1[left] > nums1[right]) {
17                    // Swap if out of order
18                    int temp = nums1[left];
19                    nums1[left] = nums1[right];
20                    nums1[right] = temp;
21                }
22                left++;
23                right++;
24            }
25
26            if (gap == 1) break;
27            gap = (gap / 2) + (gap % 2);
28        }
29    }
30}
31