class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        //count frequncy
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        //bucket list 
        List<Character>[] bucks = new List[n+1];
        for (int i = 0 ; i <= n ; i++){
            bucks[i] = new ArrayList<>();
        }
        //put char in bucket 
        for (char c : map.keySet()){
            int freq = map.get(c);
            bucks[freq].add(c);
        }

        // build result from high to low freq
        StringBuilder sb = new StringBuilder();
        for ( int i = n;i>= 1 ; i--){
            for (char c : bucks[i]){
                for(int j = 0 ; j <i ; j++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}