1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int cnt = 0 ; 
4        int xor = start ^ goal ;
5        // we get the ith bits with 1 
6        for ( int i = 0 ; i < 32 ;i++){// now we cpunt all the 1's int the xor 
7            if ((xor & ( 1<<i) )!= 0 ){// != has higher precedence than & so xor & ((1 << i) != 0) fails .... 
8
9                cnt++;
10            }
11        }
12        return cnt ;
13    }
14}