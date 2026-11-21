class Solution {
    public int[][] resultGrid(int[][] image, int threshold) {
        int m = image.length;
        int n = image[0].length;
        int[][] sum = new int[m][n];
        int[][] count = new int[m][n];

        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {

                boolean valid = true;
                int total = 0;

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        total += image[x][y];

                        if (x < i + 2 &&
                            Math.abs(image[x][y] - image[x + 1][y]) > threshold)
                            valid = false;

                        if (y < j + 2 &&
                            Math.abs(image[x][y] - image[x][y + 1]) > threshold)
                            valid = false;
                    }
                }

                if (valid) {
                    int avg = total / 9;

                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            sum[x][y] += avg;
                            count[x][y]++;
                        }
                    }
                }
            }
        }

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (count[i][j] == 0)
                    ans[i][j] = image[i][j];
                else
                    ans[i][j] = sum[i][j] / count[i][j];
            }
        }

        return ans;
    }
}