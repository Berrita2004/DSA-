class Solution {
    public int[] countBits(int n) {
        int [] ans = new int [n+1];
        //loop goes till the end of n 
        for ( int i = 0 ; i <= n ; i ++){
          
            ans[i] = ans [i>>1] +( i & 1);
        }
        return ans ;
    }
}