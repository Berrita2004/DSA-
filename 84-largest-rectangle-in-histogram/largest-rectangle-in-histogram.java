class Solution {
    public int [] nextSmallerElement (int[] arr){
        int n = arr.length ;
        Stack <Integer> st = new Stack<>();
        int [] nse = new int[n];
        for ( int i = n-1 ; i >= 0 ; i--){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ?  n : st.peek();
            st.push(i);
        }
        return nse;
    }

       public  int [] prevSmallerElement (int[] arr){
        int n = arr.length ;
        Stack <Integer> st = new Stack<>();
        int [] pse = new int[n];
        for ( int i = 0 ; i < n ; i++){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ?  -1 : st.peek();
            st.push(i);
        }
        return pse;
    }



    public int largestRectangleArea(int[] heights) {
        int Max_area= 0 ;
        int[] p = prevSmallerElement(heights);
        int [] q =  nextSmallerElement(heights);
        for ( int i = 0 ; i < heights.length ;i ++){
            int width = q[i] - p[i] - 1;
           int area = width * heights[i]  ;
           Max_area = Math.max(area, Max_area);
        }
        return  Max_area;
    }
}