class Solution {
    public int[] countBits(int n) {
        int [] ans = new int [n+1];
        //loop goes till the end of n 
        for ( int i = 0 ; i <= n ; i ++){
            int cnt = 0 ;
            int x = i ;

            while (x!= 0){
                cnt += x & 1;
                x = x >> 1;
                // use diffrent variable for i 
            }
            ans[i] = cnt ;
        }
        return ans ;
    }
}