class Solution {
    public double findMedianSortedArrays(int[] a, int[] b){

        int n1 = a.length, n2 = b.length;
        int n = n1 + n2;

        int ind1 = (n - 1) / 2;  // left middle index
        int ind2 = n / 2;        // right middle index
        int cnt = 0;             // imaginary merged index

        int i = 0, j = 0;
        int ind1el = -1, ind2el = -1;

        // Merge process without extra array
        while (i < n1 && j < n2) {
            int val;
            if (a[i] <= b[j]) {
                val = a[i];
                i++;
            } else {
                val = b[j];
                j++;
            }

            if (cnt == ind1) ind1el = val;
            if (cnt == ind2) ind2el = val;
            cnt++;
        }

        // Leftover from a[]
        while (i < n1) {
            int val = a[i];
            if (cnt == ind1) ind1el = val;
            if (cnt == ind2) ind2el = val;
            cnt++;
            i++;
        }

        // Leftover from b[]
        while (j < n2) {
            int val = b[j];
            if (cnt == ind1) ind1el = val;
            if (cnt == ind2) ind2el = val;
            cnt++;
            j++;
        }

        // Odd length → return middle
        if (n % 2 == 1) return (double) ind2el;

        // Even length → return average of two middle
        return (ind1el + ind2el) / 2.0;
    }
}

    
