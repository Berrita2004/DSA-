class Solution {
    public int trap(int[] height) {
        int lmax = 0 ; int rmax = 0;
        int total = 0 ; 
        int n = height.length;
        int l = 0 ; 
        int r = n-1;
        while ( l< r){
            // well work on the smaller unit first 
            if ( height [l] <= height[r]){
                //agar lmax bada hai toh pani add ho jo add kardenge 
                if (lmax > height[l]){
                    total += lmax - height[l];
                }
                else { //warna lmax ki value update
                    lmax = height[l];
                }
                l++;
            }
            else {// same above logic
                if (rmax > height[r]){
                    total += rmax- height[r];
                }
                else {
                    rmax = height[r];
                }
                r--;
            }
        }
        return total;
    }
}