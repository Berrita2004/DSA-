class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int og = x;
        while ( x > 0 ){
            int last = x %10;
            x = x /10;
             n = (n *10) + last ;
        }
        if (n == og ){
            return true ;
        }
        else return false;
    }
}