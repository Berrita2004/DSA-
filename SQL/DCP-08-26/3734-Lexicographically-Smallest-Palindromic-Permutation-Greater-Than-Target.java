class Solution {
    public String smallestPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        int half = n / 2, mid = n % 2;
        int oddChar = -1, oddCount = 0;
        for (int c = 0; c < 26; c++) {
            if (freq[c] % 2 == 1) { oddChar = c; oddCount++; }
        }

        int M = -1;
        if (mid == 0) {
            if (oddCount != 0) return "";
        } else {
            if (oddCount != 1) return "";
            M = oddChar;
        }

        int[] pairCount = new int[26];
        for (int c = 0; c < 26; c++) pairCount[c] = freq[c] / 2;

        int[] tgt = new int[n];
        for (int i = 0; i < n; i++) tgt[i] = target.charAt(i) - 'a';

        // ---- Case A: match target's first half exactly ----
        int[] T = Arrays.copyOfRange(tgt, 0, half);
        int[] tCount = new int[26];
        for (int c : T) tCount[c]++;

        if (Arrays.equals(tCount, pairCount)) {
            String candidate = build(T, mid, M);
            if (candidate.compareTo(target) > 0) return candidate;
        }

        // ---- Case B: find rightmost position to exceed target ----
        int[] remaining = pairCount.clone();
        int bestK = -1;
        int[] bestState = null;

        for (int i = 0; i < half; i++) {
            int t = tgt[i];
            for (int c = t + 1; c < 26; c++) {
                if (remaining[c] > 0) {
                    bestK = i;
                    bestState = remaining.clone();
                    break;
                }
            }
            if (remaining[t] > 0) {
                remaining[t]--;
            } else {
                break; // can't extend the matched prefix further
            }
        }

        if (bestK == -1) return "";

        remaining = bestState;
        int t = tgt[bestK];
        int x = -1;
        for (int c = t + 1; c < 26; c++) {
            if (remaining[c] > 0) { x = c; break; }
        }
        remaining[x]--;

        int[] L = new int[half];
        for (int i = 0; i < bestK; i++) L[i] = tgt[i];
        L[bestK] = x;

        int idx = bestK + 1;
        for (int c = 0; c < 26; c++) {
            for (int k = 0; k < remaining[c]; k++) {
                L[idx++] = c;
            }
        }

        return build(L, mid, M);
    }

    private String build(int[] L, int mid, int M) {
        int half = L.length;
        int n = half * 2 + mid;
        char[] res = new char[n];
        for (int i = 0; i < half; i++) res[i] = (char) (L[i] + 'a');
        if (mid == 1) res[half] = (char) (M + 'a');
        for (int i = 0; i < half; i++) res[n - 1 - i] = (char) (L[i] + 'a');
        return new String(res);
    }
}