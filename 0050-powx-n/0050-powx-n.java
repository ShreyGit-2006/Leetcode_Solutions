class Solution {
    public double myPow(double x, int n) {
        long p = n;
        double result = 1.0;

        if(p < 0)
            p = -p;

        while(p > 0)
        {
            if(p % 2 == 1)
                result *= x;

            x *= x;
            p /= 2;
        }

        if(n < 0)
            result = 1.0/result;

        return result;
    }
}