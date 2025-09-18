class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] ans = new int [nums.length];
         Stack <Integer> st = new Stack<>();
        for ( int j = 2 *(nums.length-1) ; j >= 0 ; j --){
            int i = j% (nums.length);
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if (st.isEmpty()) ans[i] = -1;
            else if (st.isEmpty())  {ans[i] = -1;     }
                     
            else ans[i] = st.peek();
            
            st.push(nums[i]);
        }
        return ans;
    }
}