class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 ;
        int right = s.length()-1;
        while ( left < right ){
            int l = s.charAt(left);
            int r = s.charAt(right);
            //check condition
            if (!Character.isLetterOrDigit(l)){
                left++;
            }
            else if (!Character.isLetterOrDigit(r)){
                right--;
            }
            else if (Character.toLowerCase(l)!= Character.toLowerCase(r)){
                return false ;
            }
            else {
                left++;
                right--;
            }
        } 
        return true ;
    }
}