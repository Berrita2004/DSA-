class Solution {
    public int removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int k = 0;
        for (int num : set) {
            arr[k++] = num;
        }
        return k;
    }
}