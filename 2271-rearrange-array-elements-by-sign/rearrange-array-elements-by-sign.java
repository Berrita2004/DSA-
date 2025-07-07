class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ; 
        int [] p = new int [n];
        int [] ne = new int [n];
           int neg = 0 ;
        int pos = 0 ;
        for ( int i = 0 ; i < n ; i ++){
         
            if (nums[i ]> 0 ){
            p[pos]= nums[i];
            pos++;
            }
            else{

             ne[neg]=nums[i];
           
             neg++;
        }
        }
         neg = 0 ;
         pos = 0 ;

        for (int i = 0; i <n ; i ++){
      
         
         if (i%2 == 0){
         nums [i]=p[pos];
         pos ++;

        }
        else {nums[i] = ne[neg];
        neg ++ ;
        
         }
           
}return nums;
}

}