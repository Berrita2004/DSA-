class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character , Integer> map = new HashMap <>();

//maps used
        for (char c : s.toCharArray())
        map.put(c,map.getOrDefault(c , 0)+1);

        for (char c :t.toCharArray())
        map.put(c, map.getOrDefault(c, 0)-1);
//
        for (var pair : map.entrySet()){
            if (pair.getValue() != 0 ){
                return false ;
            }
        }
        return true ;
    }
}