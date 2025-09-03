class Solution {
    public int myAtoi(String s) {
        int i = 0 ;
        int n = s.length();
        int sign = 1;
        long res = 0;
        while (i< n && s.charAt(i)==' '){
            i++;
        }
        if (i < n && ( s.charAt(i)=='-' ||  s.charAt(i)=='+')){
            if (s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))){
            if (res > Integer.MAX_VALUE / 10 || 
                   (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 +(s.charAt(i)-'0');
            i++;
        }
        return (int)(sign * res);
    }
}