class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length(); 
        StringBuilder clean = new StringBuilder();
        
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
         int start = 0 ;    
        int ed  = clean.length() - 1;
        while(start<ed){
            if (clean.charAt(start) != clean.charAt(ed)) {
                return false;
        }
        start++;
        ed--;
        }
        return true;

    }
}