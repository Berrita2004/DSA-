class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0 ; 
        int maxLen = 0 ;
        
        HashMap <Character, Integer> mpp = new HashMap <>();
        for ( int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(mpp.containsKey(c)){
                l =Math.max(l, mpp.get(c) +1);
            }
            int len = i-l+1;
            maxLen = Math.max(maxLen, len);
            mpp.put(c , i);

        }
        return maxLen;
    }
}