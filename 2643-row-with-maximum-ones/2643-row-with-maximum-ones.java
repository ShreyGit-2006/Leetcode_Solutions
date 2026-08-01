class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count;
        int row=0;
        int maxcount=0;
        for(int i=0;i<mat.length;i++)
        {
            count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
             if(count>maxcount) 
        {
            maxcount=count;
            row=i;
        }
        }
        return new int[]{row,maxcount};
    }
}