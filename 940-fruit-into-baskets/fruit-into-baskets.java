class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0 ; int r = 0 ;
        int maxLen = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        while( r < n ){
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) +1);
    
            while ( mpp.size() > 2){
                mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                if ( mpp.get(fruits[l])== 0){
                mpp.remove(fruits[l]);
                }
                l++;
            }
            
                int len = r-l +1;
                maxLen = Math.max(len , maxLen);
            
            r++;
        }
        return maxLen;
    }
}