class Solution {  // recurrsion 
    public int helper(String s , int i , int ans , int sign){
         int n = s.length();
         
        if ( i == n ) return ans ;
        if (!Character.isDigit(s.charAt(i))) return ans ;
        int digit = s.charAt(i) - '0';
        if (ans > Integer.MAX_VALUE / 10 || 
            (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
               ans = ans * 10 + digit;
        return helper(s, i + 1, ans, sign);
    }


    public int myAtoi(String s) {
        int n = s.length();
        int ans = 0 ;
        int sign = 1;
        int i = 0 ; 
        while ( i < n && s.charAt(i)==' '){
            i++;
        }
        if ( i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if (s.charAt(i)== '-'){
                sign = -1;
            }
            i++;
        }
        return helper(s, i , ans , sign) * sign;
    }
}