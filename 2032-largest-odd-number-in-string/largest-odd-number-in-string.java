class Solution {
    public String largestOddNumber(String num) {
        int n = num.length()-1;
        while ( n>=0){
            char c = num.charAt(n);
            if((c - '0')% 2 == 1){
                return num.substring(0, n+1);
            }
            else {
                n--;
            }
        }
        return "";
    }
}