1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int [] ans = new int [nums.length];
4         Stack <Integer> st = new Stack<>();
5        for ( int j = 2 *(nums.length-1) ; j >= 0 ; j --){ // hum circular chal rahe hai!
6            int i = j% (nums.length);
7            while(!st.isEmpty() && st.peek() <= nums[i]){
8                st.pop();
9            }
10            if (st.isEmpty()) ans[i] = -1;
11            else if (st.isEmpty())  {ans[i] = -1;     }
12                     
13            else ans[i] = st.peek();
14            
15            st.push(nums[i]);
16        }
17        return ans;
18    }
19}