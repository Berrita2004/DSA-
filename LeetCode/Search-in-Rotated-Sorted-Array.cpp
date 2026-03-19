1class Solution {
2public:
3    int search(vector<int>& nums, int target) {
4        int left = 0 ;
5        int right = nums.size()-1;
6
7        while (left <= right) {
8            int mid = (left + right)/2;
9
10            if (nums[mid ]== target ) {
11                return mid ;
12            }
13            if (nums[left ]<= nums[mid]) {
14                if (target >= nums[left] && target <= nums[mid]) {
15                    right = mid -1 ;
16                }
17                else {
18                    left = mid + 1;
19                }
20            }
21            else {
22                if (target >= nums[mid] && target <= nums[right]) {
23                    left = mid +1 ;
24                }
25                else {
26                  right = mid -1 ;
27                    }
28                }
29            }
30        
31        return -1;
32    }
33};
34