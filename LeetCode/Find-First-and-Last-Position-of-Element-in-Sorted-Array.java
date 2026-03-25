1class Solution { 
2    // re-coding 
3    // revison 
4    public int[] searchRange(int[] nums, int target) {
5     int n = nums.length;
6     int[] res = new int[2];
7     res[0] = firstIdx(nums,target,n);
8     res[1] = secIdx(nums,target,n);
9     return res;
10    }
11    public int firstIdx(int[]nums, int target, int n ){
12       int low = 0 ;
13       int high = n-1;
14       int ans = -1 ; 
15       while(low <= high ){
16        int mid = (low + high)/2 ;
17        if (nums[mid]== target ){
18             ans = mid;
19            high = mid -1;
20        }
21        else if (nums[mid]<target){
22            low = mid + 1 ;
23        }
24        else  high = mid -1;
25        
26       }
27       return ans ;
28    }
29      public int secIdx(int[]nums, int target, int n ){
30       int low = 0 ;
31       int high = n-1;
32       int ans = -1 ;
33       while(low <= high ){
34        int mid = (low + high)/2 ;
35        if (nums[mid]== target ){
36             ans = mid;
37            low = mid + 1 ;
38        }
39        else if(nums[mid]<target){
40           low = mid +1;
41        }
42        else high = mid -1;
43        
44       }
45       return ans ;
46    }
47
48}