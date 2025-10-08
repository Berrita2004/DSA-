class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 ;
        int n = s.length();
        int maxLen = 0;
        HashMap <Character, Integer> mpp = new HashMap<>();

        for ( int r =  0 ; r < n; r++){
            char c = s.charAt(r);
            //kya hashmap mai l ki value pehle se hai ?
            //kya woh purani hai ya new?
            if (mpp.containsKey(c) && mpp.get(c) >= l ){
                l = mpp.get(c) +1 ;
            }
            //length nikalo and fir maxlength calculate karo 
            int len = r -l +1;
            maxLen = Math.max(maxLen,len);
            //new values update karna mat bholo 
            mpp.put(c,r);
        } 
        return maxLen;
    }
}