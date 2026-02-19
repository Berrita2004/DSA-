1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n<=0) return false;
4        if ((n & (n-1)) == 0) return true;
5        else return false;
6    }
7}