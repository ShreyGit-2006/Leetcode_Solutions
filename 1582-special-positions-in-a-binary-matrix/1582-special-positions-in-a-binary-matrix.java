class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 1) {
                    int row = 0;
                    int col = 0;

                    for (int k = 0; k < mat[0].length; k++)
                        row += mat[i][k];

                    for (int k = 0; k < mat.length; k++)
                        col += mat[k][j];

                    if (row == 1 && col == 1)
                        count++;
                }
            }
        }

        return count;
    }
}