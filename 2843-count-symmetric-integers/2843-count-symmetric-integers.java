class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        int count1 = 0;
        int sum = 0;
        int sum1 = 0;
        for (int i = low; i <= high; i++) {
            count = 0;
            sum = 0;
            sum1 = 0;
            int temp = i;
            int temp1 = i;
            int temp2 = i;
            int rev = 0;
            while (temp2 > 0) {
                int rem = temp2 % 10;
                rev = rev * 10 + rem;
                temp2 /= 10;
            }
            while (temp > 0) {
                temp /= 10;
                count++;
            }
            if (count % 2 == 0) {
                int t = count / 2;
                int t1 = t;
                while (t > 0) {
                    int rem = temp1 % 10;
                    sum += rem;
                    temp1 /= 10;
                    t--;
                }
                while (t1 > 0) {
                    int rem = rev % 10;
                    sum1 += rem;
                    rev /= 10;
                    t1--;
                }
                if (sum == sum1)
                    count1++;
            }
        }
        return count1;
    }
}