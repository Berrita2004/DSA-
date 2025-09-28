class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0 ; 
        int rsum = 0 ; 
        int maxSum = 0 ;
        int n = cardPoints.length;
        for ( int i = 0 ; i <= k-1 ; i++){
            lsum = lsum + cardPoints[i];
        }
        maxSum = lsum;
        int rightIdx = n-1 ;
        for (int j = k-1 ; j >= 0 ; j --){
            lsum = lsum - cardPoints[j];
            rsum = rsum + cardPoints[rightIdx];
            rightIdx -- ;
            maxSum = Math.max(maxSum ,( lsum + rsum));
        }
        return maxSum;

    }
}