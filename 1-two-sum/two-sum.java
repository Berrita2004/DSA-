class Solution {
    public int[] twoSum(int[] nums, int target) {
        // enter the index of 2 number such that it becomes target 
        // points i forget make a new array 
        int[] arr= new int [2];
    
        for  (int i = 0; i < nums.length ; i ++ ){
            for (int j =i+1; j < nums.length ; j ++){
                if ((nums[i]+nums[j])==target){
                    //how to write the output 
                    arr[0]=i;
                    arr[1]=j;
                    break;
                    //break to exit the loop 
                }
               
            }
        }
          return arr; 
       
    }
}