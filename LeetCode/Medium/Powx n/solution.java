class Solution {
    public double myPow(double x, int n) {
        long N = n;
        boolean negative = N < 0;

        if (N < 0) {
            N = -N;
        }

        double ans = 1.0;

        while (N > 0) {

            if (N % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            N = N / 2;
        }

        if (negative) {
            return 1.0 / ans;
        }

        return ans;
    }
}