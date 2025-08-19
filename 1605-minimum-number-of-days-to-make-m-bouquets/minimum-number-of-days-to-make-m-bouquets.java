class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        //pehle max and min alag nikalo 
        int min = Integer.MAX_VALUE ; 
        int max = Integer.MIN_VALUE;
        int n = bloomDay.length;
        for (int bloom : bloomDay){
            max = Math.max(max, bloom);
            min = Math.min(min, bloom);
        }
        // bs ka logic
        int low = min ; 
        int high = max ; 
        int res = -1 ;
        if (n < (m*k)) return -1 ;
        while (low <= high){
            int mid = ( high+ low)/2;
            if (possible(bloomDay, m , k , mid)){
                res = mid ;
           
                high = mid -1;
        }
            else {
                low = mid +1 ;
            }
        }
        return res ; 
    }

    //important maths ka part 
    public static boolean possible (int []bloomDay, int m, int k , int mid){
        int n = bloomDay.length;
        int count = 0 ; 
        int nob = 0 ; 
        for ( int i = 0 ; i < n ; i++){
            if ( bloomDay[i]<=mid)
            {
                count ++;
            }
            else {
                nob += (count / k );
                count = 0 ;
            }
        }
        
        nob += count /k;
        return nob>=m;

    }

}