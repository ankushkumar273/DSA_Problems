class Solution {
    double power(double x, int n) {
        // code here
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return mypow(x,N);
    }
        double mypow(double x, long n){
            if(n == 0){
                return 1;
            }
            
            double half = mypow(x, n / 2);
            
            if(n%2 == 0){
             return half*half;   
            }else {
                return x*half*half;
        }
    }
}
