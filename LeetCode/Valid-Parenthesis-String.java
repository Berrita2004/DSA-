1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0 ;  //min open brackets
4        int high = 0 ;// max  open brackets
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
15                low--;// if '*' acts as ')'
16                high ++;// if '*' acts as '('
17            }
18            //low and high cannot be negative 
19            if (high < 0 ) return false ;
20            low = Math.max(low, 0);
21        }
22        return low == 0 ;
23    }
24}