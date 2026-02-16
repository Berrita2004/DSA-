1class Solution {
2    public int reverseBits(int n) {
3        int result = 0 ;
4        for ( int i = 0 ; i < 32 ; i ++){
5            int bit = (n >> i) & 1;
6            
7            result |= (bit << (31 - i));
8        }
9        return result ;
10
11    }
12}