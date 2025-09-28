class Solution {
    public int lengthOfLongestSubstring(String s) {
         int maxLength = 0;
         int n = s.length();
         int i = 0;
         while(i < n ){
            Set<Character> t = new HashSet<>();
            int j = i  ;
            while (j < n && !t.contains(s.charAt(j))){
                t.add(s.charAt(j));
                j++;
            }
             maxLength = Math.max(maxLength, j - i);
             i ++;
         }
         return maxLength;
    }
}