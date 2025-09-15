class Solution {
    // using one O(N) sapce 
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        // Build prefix array
        int[] prefix = new int[n];
        prefix[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        //  Traverse from right while tracking rightMax, ek saath 2 kaam karo
        int rmax = height[n - 1];
        int total = 0;
        for (int i = n - 1; i >= 0; i--) {
            rmax = Math.max(rmax, height[i]);
            int water = Math.min(prefix[i], rmax) - height[i];
            if (water > 0) total += water;
        }

        return total;
    }
}
