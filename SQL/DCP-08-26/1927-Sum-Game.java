class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int lks = 0;
        int rks = 0;
        int lc = 0;
        int rc = 0;

        for (int i = 0; i < n; i++) {
            if (num.charAt(i) == '?') {
                if (i < n / 2) {
                    lc++;
                } else {
                    rc++;
                }
            } else {
                if (i < n / 2) {
                    lks += num.charAt(i) - '0';
                } else {
                    rks += num.charAt(i) - '0';
                }
            }
        }

        int tq = lc + rc;

        // Odd number of '?' -> Alice can always win
        if (tq % 2 == 1) {
            return true;
        }

        int LEFT = 2 * lks + 9 * lc;
        int RIGHT = 2 * rks + 9 * rc;

        return LEFT != RIGHT;
    }
}
