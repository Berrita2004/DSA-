class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque <Integer> dq = new LinkedList <>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for ( int i = 0 ; i < n; i++){
            //this is the condition for Removing Out-of-Window Index
            if (!dq.isEmpty() && dq.peekFirst()< i -k+1){
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1) {
                // ans is goint out of bounds 
                ans[i-k+1] = (nums[dq.peekFirst()]);
            }
        }
        return ans;

    }
}