class Solution {
    public int diagonalPrime(int[][] nums) {
        int t = nums.length;
        int i, j;
        int count = 0;
        int currPrime = 0;
        int maxPrime = 0;

        for (i = 0; i < t; i++) {
            currPrime = 0;

            for (j = 0; j < nums[0].length; j++) {

                if (i == j || i + j == t - 1) {

                    int temp = nums[i][j];
                    count = 0;

                    if (temp > 1) {
                        for (int k = 2; k*k <= temp; k++) {
                            if (temp % k == 0) {
                                count++;
                                break;
                            }
                        }

                        if (count == 0 && temp>currPrime)
                            currPrime = temp;
                    }
                }
            }

            if (currPrime > maxPrime)
                maxPrime = currPrime;
        }

        return maxPrime;
    }
}