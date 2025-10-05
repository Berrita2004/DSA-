class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0; 
        int maxLen = 0 ; int maxFreq = 0;
        int r = 0 ;
        HashMap <Character , Integer > h = new HashMap <>();
        while ( r < n){
        char c = s.charAt(r);
        h.put(c , h.getOrDefault(c,0)+1);
        maxFreq = Math.max(maxFreq , h.get(c));
        int len = r-l+1;
        if (((r-l+1)-maxFreq) >k){
            char left= s.charAt(l);
             h.put(left,h.get(left)-1);
             l++;
        }
         maxLen = Math.max(maxLen, r - l + 1);
         r++;
      } 
      return maxLen;
    }
}