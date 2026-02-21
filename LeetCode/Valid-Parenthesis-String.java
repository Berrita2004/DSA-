1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0 ; 
4        int high = 0 ;
5        for ( char ch : s.toCharArray()){
6            if (ch == '('){
7                low++;
8                high++;
9            }
10            else if (ch == ')') {
11                low -- ;
12                high --;
13            }
14            else {
15                low--;
16                high ++;
17            }
18            if (high < 0 ) return false ;
19            low = Math.max(low, 0);
20        }
21        return low == 0 ;
22    }
23}