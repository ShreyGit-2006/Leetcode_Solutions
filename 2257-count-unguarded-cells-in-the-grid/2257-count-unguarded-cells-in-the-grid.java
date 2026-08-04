class Solution {

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int[][] vis = new int[m][n];

        // 1 = guard
        for (int[] g : guards)
            vis[g[0]][g[1]] = 1;

        // 2 = wall
        for (int[] w : walls)
            vis[w[0]][w[1]] = 2;

        // Traverse from every guard
        for (int[] g : guards) {

            int r = g[0];
            int c = g[1];

            // Up
            for (int i = r - 1; i >= 0; i--) {
                if (vis[i][c] == 1 || vis[i][c] == 2)
                    break;
                vis[i][c] = 3;
            }

            // Down
            for (int i = r + 1; i < m; i++) {
                if (vis[i][c] == 1 || vis[i][c] == 2)
                    break;
                vis[i][c] = 3;
            }
            for (int j = c - 1; j >= 0; j--) {
                if (vis[r][j] == 1 || vis[r][j] == 2)
                    break;
                vis[r][j] = 3;
            }
            for (int j = c + 1; j < n; j++) {
                if (vis[r][j] == 1 || vis[r][j] == 2)
                    break;
                vis[r][j] = 3;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0)
                    ans++;
            }
        }
        return ans;
    }
}