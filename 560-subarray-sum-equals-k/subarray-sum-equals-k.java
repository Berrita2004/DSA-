class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 ; //prefix sum
        int count = 0 ; //no. of subarray with criteria

        // freq map
        Map <Integer , Integer> map = new HashMap <>();
        map.put(0,1);
        for ( int num : nums){
           sum += num;

           // If prefix[j] - prefix[i] = k
        // => prefix[i] = prefix[j] - k
            // So check how many times (sum - k) appeared before
        count += map.getOrDefault(sum-k,0);
        //store it 
        map.put(sum,map.getOrDefault(sum, 0)+1);
       
        }
        return count ;
    }
}