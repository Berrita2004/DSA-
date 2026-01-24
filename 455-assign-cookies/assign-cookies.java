class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //sort both
        Arrays.sort(g);
        //sort
        Arrays.sort(s);
        int l = 0 ;
         int r = 0 ;
         //2 pointers
         //condition 
         while (l < g.length && r < s.length){
            if(s[r]>=g[l]){
                r++;
                l++;
            }
            else {
                r++;
            }
         }
         //TC: 2 sort + 1 while loop
         return l;
    }
    // O(nlogn + mlogn) 
}