class Solution {
    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();
        int[] cnt = new int[26];

        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        // More than one odd frequency => impossible
        int odd = 0;
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if ((cnt[i] & 1) == 1) {
                odd++;
                middle = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        // Number of pairs available for left half
        int[] pairs = new int[26];

        for (int i = 0; i < 26; i++) {
            pairs[i] = cnt[i] / 2;
        }

        int half = n / 2;

        /*
         * We want to find the smallest left half
         * that is >= target's left half.
         *
         * Try to follow target as long as possible.
         */

        int[] remaining = pairs.clone();

        boolean samePrefixPossible = true;

        for (int i = 0; i < half; i++) {

            int c = target.charAt(i) - 'a';

            if (remaining[c] == 0) {
                samePrefixPossible = false;
                break;
            }

            remaining[c]--;
        }

        /*
         * Case 1:
         * We can make target's entire left half.
         *
         * Then check whether its palindrome is > target.
         */
        if (samePrefixPossible) {

            String left = target.substring(0, half);

            StringBuilder candidate = new StringBuilder();

            candidate.append(left);

            if ((n & 1) == 1) {
                candidate.append(middle);
            }

            candidate.append(new StringBuilder(left).reverse());

            if (candidate.toString().compareTo(target) > 0) {
                return candidate.toString();
            }
        }

        /*
         * Case 2:
         * Find the RIGHTMOST position where we can
         * make target[i] larger.
         *
         * For every position after i, we restore their
         * pairs because those positions are no longer
         * fixed.
         */
        int[] used = pairs.clone();

        // Consume target's left half as much as possible.
        int matched = 0;

        for (int i = 0; i < half; i++) {

            int c = target.charAt(i) - 'a';

            if (used[c] == 0) {
                break;
            }

            used[c]--;
            matched++;
        }

        /*
         * We need to search backwards.
         *
         * Rebuild the available pairs for each position.
         * Since n <= 300, O(n * 26) is completely fine.
         */
        for (int i = half - 1; i >= 0; i--) {

            /*
             * Reconstruct remaining pairs after fixing
             * target[0 ... i-1].
             */
            int[] rem = pairs.clone();
            boolean validPrefix = true;

            for (int j = 0; j < i; j++) {

                int c = target.charAt(j) - 'a';

                if (rem[c] == 0) {
                    validPrefix = false;
                    break;
                }

                rem[c]--;
            }

            if (!validPrefix) {
                continue;
            }

            int current = target.charAt(i) - 'a';

            /*
             * Increase this position by the smallest
             * possible character.
             */
            for (int next = current + 1; next < 26; next++) {

                if (rem[next] == 0) {
                    continue;
                }

                rem[next]--;

                StringBuilder left = new StringBuilder();

                // Same prefix as target
                left.append(target, 0, i);

                // First greater character
                left.append((char) ('a' + next));

                // Smallest possible suffix
                for (int c = 0; c < 26; c++) {
                    for (int k = 0; k < rem[c]; k++) {
                        left.append((char) ('a' + c));
                    }
                }

                String leftPart = left.toString();

                StringBuilder answer = new StringBuilder();

                answer.append(leftPart);

                if ((n & 1) == 1) {
                    answer.append(middle);
                }

                answer.append(
                    new StringBuilder(leftPart).reverse()
                );

                return answer.toString();
            }
        }

        return "";
    }
}