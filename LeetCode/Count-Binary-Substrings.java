1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prevCount = 0 ;
4        int currCount = 1 ;
5        int res = 0;
6        for ( int i = 1 ; i <s.length(); i++){
7            if (s.charAt(i)== s.charAt(i-1)){
8                currCount++;
9                
10            }
11            else {
12                res += Math.min(prevCount, currCount);
13                prevCount = currCount;
14                currCount= 1;
15            }
16        }
17        return res + Math.min(prevCount, currCount);
18    }
19}