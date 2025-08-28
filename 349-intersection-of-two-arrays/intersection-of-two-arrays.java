class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> sect = new HashSet<>();
        HashSet <Integer> result = new HashSet<>();
        int count = 0;
        

        for (int i : nums1){
            sect.add(i);
        } 
        for ( int i : nums2){

            if (sect.contains(i)){
                result.add(i);
            }

        }
        int [] res = new int[result.size()];
        for ( int i : result){
            res[count++]= i  ;
        
        }
       return res;

    }
}