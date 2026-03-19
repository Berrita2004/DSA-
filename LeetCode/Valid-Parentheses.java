1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> st = new Stack<>();
4        for ( int i = 0 ; i < s.length(); i ++){
5        char c = s.charAt(i);
6        if (c == '(' || c== '{'|| c== '['){
7            st.push(c);
8        }
9        else {
10            
11           if ( st.isEmpty()) return false ;
12           char top = st.pop();
13           if ( c==')' &&  top != '(' ||  c=='}' &&  top != '{' ||  c==']' &&  top != '['  ){
14            return false;
15           }
16        }
17
18        
19        }
20         return st.isEmpty ();
21    }
22}