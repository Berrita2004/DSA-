1class Solution {
2    public int countSegments(String s) {
3        int cnt = 0 ;
4        for ( int i = 0 ; i < s.length(); i++){
5            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '){
6                cnt++;
7            }
8        }
9        return cnt;
10    }
11}