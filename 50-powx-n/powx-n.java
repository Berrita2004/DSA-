class Solution {
    public double myPow(double x, int n) {
        long N = n;        // use long to handle Integer.MIN_VALUE
        if (N < 0) {       // handle negative powers
            N = -N;
            x = 1 / x;
        }

        double ans = 1;
        while (N > 0) {
            if (N % 2 == 1) {      // if current exponent is odd
                ans = ans * x;
            }
            x = x * x;             // square x
            N = N / 2;             // divide exponent by 2
        }

        return ans;
    }
}
