class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long ans = 0;

        while(a >= b) {
            long temp = b;
            long count = 1;

            while(a >= temp) {
                a -= temp;
                ans += count;
                temp <<= 1;
                count <<= 1;
            }

            // This approach needs resetting to the largest fitting divisor
        }

        if((dividend < 0) ^ (divisor < 0))
            ans = -ans;

        return (int)ans;
    }
}