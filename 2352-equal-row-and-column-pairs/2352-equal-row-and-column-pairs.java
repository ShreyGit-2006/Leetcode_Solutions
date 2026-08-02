class Solution {
    public int equalPairs(int[][] grid) {
        int size=grid.length;
        int count=0;
        int is_equal;
        int i,r,c;
        for(r=0;r<size;r++)
        {
            for(c=0;c<size;c++)
            {
                is_equal=1;
               for(i=0;i<size;i++)
               {
                  if(grid[r][i]!=grid[i][c])
                  {
                    is_equal=0;
                    break;
                  }
               }
                count+=is_equal;
            
            }
        }
        return count;
    }
}