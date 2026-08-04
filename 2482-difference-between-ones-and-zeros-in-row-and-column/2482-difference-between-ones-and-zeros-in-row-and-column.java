class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
          int m = grid.length;
        int n = grid[0].length;

        int[] rowOnes = new int[m];
        int[] colOnes = new int[n];

        // Count ones in each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }

        int[][] ans = new int[m][n];

        // Build answer matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int rowZeros = n - rowOnes[i];
                int colZeros = m - colOnes[j];

                ans[i][j] = rowOnes[i] + colOnes[j]
                          - rowZeros - colZeros;
            }
        }

        return ans;
    }
}