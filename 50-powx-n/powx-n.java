class Solution {
    public double findPower(double x , long n ){
        if (n== 0 ) return 1 ; 
        double half = findPower(x, n/2);
        if(n%2==0){
            return half * half;
        }
        else {
            return half * half * x;

            
        }
    }



    public double myPow(double x, int n) {
       long N = n;        // use long to handle Integer.MIN_VALUE
        if (N < 0) {       // handle negative powers
            N = -N;
            x = 1 / x;
        }
        return findPower(x,n);
    }
}
