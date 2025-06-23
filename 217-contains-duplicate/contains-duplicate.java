class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet <Integer> Set = new HashSet<>(); 
      HashSet <Integer> Result = new HashSet<>();
      int count = 0 ;
    
      for (int i : nums){
        if (Set.contains(i)){
           
           return true;
        }
         Set.add(i);
    }
     return false;
}
}