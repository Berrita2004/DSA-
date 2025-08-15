class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 1;
      for ( int pile : piles){
        max = Math.max(max, pile);
      }
      int low = 1 ; 
      int high = max ;
      while ( low <= high ){
        int mid = (low + high)/2 ;
        long totalhr = totalHour(piles , mid);
        if ( totalhr <= h){
            high = mid -1 ;
        }
        else {
            low = mid+1;
        }
      }
      return low ;
    }
    public static long totalHour(int [] piles , int mid){
        long t = 0 ;
        for ( int i = 0 ; i<piles.length; i++){
           t += (int) Math.ceil((double)piles[i]/ mid);
        }
        return t ;
    }
}