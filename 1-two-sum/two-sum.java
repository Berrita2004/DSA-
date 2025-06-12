class Solution {
    // Returns the indices of the two numbers such that they add up to target
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If the sum is target, return the result immediately
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j}; // Return as soon as found!
                }
            }
        }
        // If no solution found, return an empty array (or handle as needed)
        return new int[] {}; // or throw new IllegalArgumentException("No solution");
    }
}