class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int [2];
        int n = nums.length;
        HashMap <Integer,Integer> mpp = new HashMap<>();
        for ( int i = 0 ; i < n ; i ++ ){
            int num = nums[i];
            int moreNeed = target -num ;// find more need 
            if (mpp.containsKey(moreNeed)){// if true return the index of moreNeed

                arr[0]= mpp.get(moreNeed);
                arr[1]= i ; // save i as it contains num's index 
                return arr;
            }
            mpp.put(num, i);//put both of the new value in the map
        }
        return arr;

    }
}