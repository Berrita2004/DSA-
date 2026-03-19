1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int high = n-1;
5        int low = 0 ; 
6        
7        while (low <= high ){
8            int mid = (low + high)/2;
9            if (nums[mid]== target){
10               return  mid ;
11            }
12            if(nums[low]<= nums[mid]) {
13                if (nums[low]<= target && target <= nums[mid]){
14                    high = mid -1 ;
15
16                }
17                else low = mid +1 ;
18
19            }
20            else {
21                if (nums[mid]< target && target <= nums[high]){
22                    low = mid +1 ;
23                }
24                else high = mid -1 ;
25            }
26        }
27        return -1 ;
28    }
29}