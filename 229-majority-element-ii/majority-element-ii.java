class Solution {
    public List<Integer> majorityElement(int[] v) {
  int n = v.length; // size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        for (int i = 0; i < n; i++) {
            // if v[i] is already in the list, skip it
            if (ls.contains(v[i])) continue;

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            if (cnt > n / 3) {
                ls.add(v[i]);
            }

            if (ls.size() == 2) break;
        }

        return ls;
    }
}