1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map <Character , Integer> map = new HashMap <>();
4
5//maps used
6        for (char c : s.toCharArray())
7        map.put(c,map.getOrDefault(c , 0)+1);
8
9        for (char c :t.toCharArray())
10        map.put(c, map.getOrDefault(c, 0)-1);
11// re code
12        for (var pair : map.entrySet()){
13            if (pair.getValue() != 0 ){
14                return false ;
15            }
16        }
17        return true ;
18    }
19}