class Solution {
  public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return ans;  // handle empty input
        }

        int n = mat.length;
        int m = mat[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            // Traverse top row
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // Traverse bottom row if still valid
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}