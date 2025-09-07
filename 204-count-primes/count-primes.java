class Solution {
    public int countPrimes(int N) {
       if (N <= 2) return 0;  // No primes less than 2

        boolean[] prime = new boolean [N];

        // Step 1: Mark all numbers as prime initially
        for (int i = 0; i < N; i++) {
            prime[i] = true;
        }

        // 0 and 1 are not prime
        prime[0] = false;
        prime[1] = false;

        // Step 2: Sieve
        for (int i = 2; i * i < N; i++) {
            if (prime[i] == true) {  // i is prime
                for (int j = i * i; j < N; j += i) {
                    prime[j] = false;  // mark multiples as not prime
                }
            }
        }

        // Step 3: Count primes
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (prime[i] == true) count++;
        }

        return count;
    }
}