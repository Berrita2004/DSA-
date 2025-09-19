class Solution {
    public String removeKdigits(String num, int k) {
    StringBuilder res = new StringBuilder();
    int n = num.length();
    Stack <Character> st = new Stack<>();
        for ( int i = 0 ; i < n ; i ++){
            char c = num.charAt(i);
            while (!st.isEmpty() && k> 0 &&(st.peek() - '0') > (c -'0')){
                st.pop();
                k--;
            }
                st.push(c);
        }
         while ( k>0 && !st.isEmpty()){
                st.pop();
                k--;
            }
        if (st.isEmpty()) return "0" ;
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        
        while( res.length() > 1 && res.charAt(0)== '0'){
            res.deleteCharAt(0);
        }
        
        return res.length() == 0 ? "0" : res.toString();

    }
}