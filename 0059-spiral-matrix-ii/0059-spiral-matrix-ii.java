class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];

        int rb = 0;
        int re = n - 1;
        int cb = 0;
        int ce = n - 1;

        int num = 1;

        while (rb <= re && cb <= ce) {

            // Right
            for (int j = cb; j <= ce; j++) {
                ans[rb][j] = num++;
            }
            rb++;

            // Down
            for (int i = rb; i <= re; i++) {
                ans[i][ce] = num++;
            }
            ce--;

            // Left
            if (rb <= re) {
                for (int j = ce; j >= cb; j--) {
                    ans[re][j] = num++;
                }
                re--;
            }

            // Up
            if (cb <= ce) {
                for (int i = re; i >= rb; i--) {
                    ans[i][cb] = num++;
                }
                cb++;
            }
        }

        return ans;
    }
}