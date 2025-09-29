
class Solution {
     public int lengthOfLongestSubstring(String s) {
        int maxLength = 0 ; 
        int n = s.length();
        int l = 0 ;
        HashMap <Character, Integer> h = new HashMap<>();
        for ( int r = 0 ; r < n ; r++){
            char c = s.charAt(r);
            if (h.containsKey(c) && h.get(c) >= l){
                l = h.get(c) +1;
            }
        
            int len = r-l+ 1;
            maxLength = Math.max(maxLength, len);
            h.put(c,r);
        }
        return maxLength;
     }

}