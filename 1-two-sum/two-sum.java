class Solution {
    public int[] twoSum(int[] arr, int target) {
        int [] result = new int [2]; 
        int n = arr.length;
        for ( int i = 0 ; i < n ; i ++){
            for ( int j = i +1 ; j < n ; j ++){
                if (arr[i]+arr[j]== target){
                     result[0] = i ;
                    result[1]= j;
                }
            }
        }
        return result;
    }
}