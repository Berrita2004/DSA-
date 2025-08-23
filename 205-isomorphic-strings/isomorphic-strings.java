class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>  map = new HashMap <>();
        Set<Character> u = new HashSet <>();
        if (s.length()!= t.length()) return false ;
        // all char loop 
        for ( int i = 0 ; i < s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if ( map.containsKey(c1)){
                if ( map.get(c1) != c2) return false ;
            }
            else {
                if ( u.contains(c2)) return false ;
                map.put(c1, c2);
                u.add(c2);
            }
        }
        return true ;
    }
}