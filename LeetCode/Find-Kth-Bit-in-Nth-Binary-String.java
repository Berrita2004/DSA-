1class Solution {
2    public char findKthBit(int n, int k) {
3        if (n == 1) return '0';
4        
5        int len = (1 << n) - 1;     // 2^n - 1
6        int mid = (len / 2) + 1;    // middle index
7        
8        if (k == mid) return '1';
9        
10        if (k < mid) {
11            return findKthBit(n - 1, k);
12        } else {
13            char ch = findKthBit(n - 1, len - k + 1);
14            return (ch == '0') ? '1' : '0';   // invert
15        }
16    }
17}