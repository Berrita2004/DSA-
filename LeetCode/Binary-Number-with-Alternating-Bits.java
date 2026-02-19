1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int x = n^ (n>>1);
4        if ((x & (x+1))== 0){
5            return true ;
6        }
7        return false ;
8    }
9}