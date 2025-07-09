class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        int c1 = 0 ; int c2= 0 ; 
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i ++){
            if ( c1 ==0 && nums[i]!=el2){
                el1=nums[i];
                c1=1;
            }
            else if (c2== 0 &&  nums[i]!= el1){
                el2=nums[i];
                c2= 1;
            }
            else if (nums[i]==el1) c1++;
            else if (nums[i]==el2) c2++;
            else{
                c1--;c2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        c1= 0 ; c2= 0 ;
        for ( int i = 0 ; i < n; i++){
            if(nums[i]==el1) c1++;
            if(nums[i]==el2) c2++;
        }
       
        if ( c1 > n/3) ans.add(el1);
        if(c2> n/3) ans.add(el2);

        return ans ;
    }
}