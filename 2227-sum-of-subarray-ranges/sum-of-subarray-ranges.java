class Solution {
    public static int [] nextSmallerElement (int [] nums){
        Stack <Integer> st = new Stack<>();
        int n = nums.length;
        int [] nse = new int [nums.length];
      for ( int i = nums.length-1; i >= 0 ; i--){
        while ( !st.isEmpty() && nums[ st.peek()] >= nums[i] ){
            st.pop();
        }
        nse[i] = st.isEmpty() ? n : st.peek(); 
        st.push(i);
        } 
    return nse; 
}
    public static int [] previousSmallerElement(int [] nums){
        Stack <Integer> st = new Stack<>();
        int [] pse = new int [nums.length];
        int n = nums.length;
        for ( int i = 0 ; i < n ;i++){
            while (!st.isEmpty() && nums[st.peek()]> nums[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 :st.peek();
            st.push(i);
        }
        return pse ;
    }

    public static long sumSubarrayMins( int []nums){
       long mod = 1_000_000_007;
        long sum = 0 ;
        int[] p = previousSmallerElement(nums);
        int [] q =  nextSmallerElement(nums);
        for ( int i = 0 ; i < nums.length ;i ++){
            int left = i-p[i];
            int right = q[i] -i ;
            sum = (sum + (long)nums[i] * left * right ) ;
        }
        return  sum;
    }

    public static int [] prevGreaterElement(int [] nums){
        int n = nums.length;
        int [] pge = new int [n];
        Stack <Integer> st = new Stack<>();
        for ( int i = 0; i <n ; i++){
            while ( !st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
             pge[i] =  st.isEmpty() ? -1 :st.peek();
             st.push(i);
        }
    return pge;
    }

    public static int [] nextGreaterElement(int [] nums){
         int n = nums.length;
        int [] nge = new int [n];
        Stack <Integer> st = new Stack<>();
         for ( int i = n-1; i >= 0 ; i--){
            while ( !st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
             nge[i] =  st.isEmpty() ? n :st.peek();
             st.push(i);
        }
        return nge;
    }

     public static long sumSubarrayMaxs( int []nums){
       long mod = 1_000_000_007;
        long sum = 0 ;
        int[] p = prevGreaterElement(nums);
        int [] q =  nextGreaterElement(nums);
        for ( int i = 0 ; i < nums.length ;i ++){
            int left = i-p[i];
            int right = q[i] -i ;
            sum = (sum + (long)nums[i] * left * right );
        }
        return sum;
    }


    public long subArrayRanges(int[] nums) {
        long min = sumSubarrayMins(nums);
        long max = sumSubarrayMaxs(nums);
        long ans = max - min;
        return ans ;
    }
}