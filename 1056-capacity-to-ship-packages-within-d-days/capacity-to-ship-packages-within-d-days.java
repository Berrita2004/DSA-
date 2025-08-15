class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE ; 
        int sum = 0 ; 
        for (int weight : weights){
            sum += weight;
            max = Math.max(max,weight );
        }
        int low = max;
        int high = sum ;
        while ( low <= high){
            int mid = (low + high)/2 ;
            int cap = findCap (weights, days , mid);
            if (cap <= days){
                high = mid -1 ;
            }
            else {
                low = mid +1;
            }
        }
        return low ;

    }
    public static int findCap(int [] weights , int days , int mid ){
        int load = 0 ;
        int cap = 1 ; 
        for (int i = 0 ; i < weights.length; i++){
            if(load + weights[i] > mid){
                cap++;
                load = weights[i];
            }
            else {
                load+= weights[i];
            }
        } 
        return cap ; 
    }
}