class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums , 0, n-1);
    }

        


    
     public int merge(int[] nums, int left , int mid , int right ){
        int [] temp = new int [right - left +1];
        int count =0 ;
        int low = left ;
        int high = mid +1 ; 
        int idx = 0 ; 
        while (low <= mid && high <= right ){
            if (nums[low]<= nums[high]){
                temp[idx]= nums[low];
               
                idx++;
                low++;
            }
            else {
                temp[idx]= nums[high];
                idx++;
                high++;
            }
        }
            while ( low<= mid){
                temp[idx]= nums[low];
                idx++;
                low++;
            }
            while ( high <=right)
            {
               temp[idx]= nums[high];
                idx++;
                high++;

            }
            for ( int i = 0 ;i < temp.length; i ++){
               nums[left+i] = temp [i];

            }
            
          
        
        return count;
     }
    private int countReversePair(int[] nums, int left , int mid , int right){
        int count = 0;
        int j = mid + 1;
        for ( int i =left ;i <= mid ; i ++){
            while( j <= right && (long) nums[i]> 2L * nums[j]){
                j++;
            }
            count += (j -(mid+1));
        }
        return count;
    }





    public int mergeSort ( int[] nums , int left, int right){
        int count = 0 ; 

        if (left >= right) return 0 ;
        int mid = (left+right)/2;
        count += mergeSort(nums, left , mid);
        count += mergeSort(nums, mid+1, right);
        count += countReversePair(nums, left , mid , right );
        merge(nums, left , mid , right);
        return count ;
    }
    

}