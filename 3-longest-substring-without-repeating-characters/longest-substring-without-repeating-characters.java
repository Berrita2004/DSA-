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
            int len = r -l +1;
            maxLen = Math.max(maxLen,len);
            mpp.put(c,r);
        } 
        return maxLen;
    }
}