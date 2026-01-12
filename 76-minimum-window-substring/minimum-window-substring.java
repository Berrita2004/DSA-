class Solution {
    public String minWindow(String s, String t) {
        int m = t.length();
        int n = s.length();
        int minLen = Integer.MAX_VALUE ;
        int l =0 , r = 0 ;
        int stIdx = 0 ;


        int [] map = new int[128];
        for ( char c : t.toCharArray()){
            map[c]++;
        }

        while ( r < n ){
            if (map[s.charAt(r)] > 0){
                m--;
            }
            map[s.charAt(r)]--;
            r++;
            while(m == 0){
                if(r-l <minLen){
                    minLen = r-l;
                    stIdx= l;
                }
                map[s.charAt(l)]++;
                if(map[s.charAt(l)]>0){
                    m++;
                }
                l++;
            }
        }
       
        return minLen == Integer.MAX_VALUE ? "" : s.substring(stIdx, stIdx + minLen);

    }
}