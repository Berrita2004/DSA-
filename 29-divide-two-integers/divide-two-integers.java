class Solution {
    public int divide(int dividend, int divisor) {
        // Overflow case: -2^31 / -1 = 2^31 (out of int range)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to avoid overflow when taking abs of MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long ans = 0;
        // Try to fit b << i into a, from high bit to low bit
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                ans += 1L << i;     // add 2^i to the quotient
                a -= b << i;        // subtract (b * 2^i) from remainder
            }
        }

        if (negative) ans = -ans;
        // Safety clamp (shouldn’t trigger except extreme edges)
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) ans;
    }
}
