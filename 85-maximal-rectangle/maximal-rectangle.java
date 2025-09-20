class Solution {
    public int largeHistogram(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea =0 ;
        for ( int i = 0 ; i < n ; i++){
            while (!st.isEmpty() && heights[st.peek()] > heights[i] ){
                int element =  heights[st.peek()];
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek(); 
                int width = nse - pse -1 ;
                int area = width * element;
                maxArea = Math.max(area , maxArea);
            }
            st.push(i);

        }
        while (!st.isEmpty()){
            int element =  heights[st.peek()];
                st.pop();
                int nse = n;
                int pse = st.isEmpty() ? -1 : st.peek(); 
                int width = nse - pse -1 ;
                int area = width * element;
                maxArea = Math.max(area , maxArea);
        }
        return maxArea;
    }



    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m =matrix[0].length;
        int [][] psum = new int[n][m];
        int maxArea = 0 ;
         for (int j = 0 ; j < m ; j++ ){
            int sum = 0 ; 
           for ( int i = 0 ; i <n ; i ++){
                if (matrix[i][j] == '1') {
                    sum++;
                }else {
                    sum = 0; 
                }
            psum[i][j] = sum ;
            }

        }
        for ( int i=0 ; i < n ; i++){
            int lh = largeHistogram(psum[i]);
            maxArea = Math.max (maxArea, lh);
        }
        return maxArea;
    }
}