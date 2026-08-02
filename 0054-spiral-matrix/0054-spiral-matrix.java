class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rb=0;
        int re=matrix.length-1;
        int cb=0;
        int ce=matrix[0].length-1;
        while(rb <= re && cb <= ce)
        {
            for(int j=cb;j<=ce;j++) ans.add(matrix[rb][j]);
            rb++;
            for(int i=rb;i<=re;i++) ans.add(matrix[i][ce]);
            ce--;
            if(rb<=re)
            {
                for(int j=ce;j>=cb;j--) ans.add(matrix[re][j]);
                re--;
            }
             if(cb<=ce)
            {
                for(int i=re;i>=rb;i--) ans.add(matrix[i][cb]);
                cb++;
            }

        }
        return ans;
    }
}