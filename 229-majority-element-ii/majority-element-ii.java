class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int n = nums.length;
      HashMap <Integer,Integer> map = new HashMap <>();
      List<Integer> ls = new ArrayList<>();
      int mini = n/3;
      for ( int i = 0 ; i < n ; i ++){
     int val = map.getOrDefault(nums[i],0);
     map.put(nums[i],val+1);

     if(map.get(nums[i])> mini && !ls.contains(nums[i])){
        ls.add(nums[i]);
     }
     if (ls.size() == 2) break;
      }
      return ls;



    }
}