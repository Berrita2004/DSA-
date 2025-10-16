class Solution {
    public int lengthOfLongestSubstring(String s) {
        // two pointer 
        int n = s.length();
        int l = 0 ; 
        int maxLen = 0 ; 
        HashMap <Character, Integer> map = new HashMap<>();
        for ( int r = 0 ;  r < n ; r++){
            char c = s.charAt(r);
           if ( map.containsKey(c) && map.get(c) >= l){
            l = map.get(c) + 1;
           }
           int len = r - l + 1 ;
           maxLen = Math.max(maxLen, len);
           map.put(c, r);
        }
        return maxLen;
    }
}