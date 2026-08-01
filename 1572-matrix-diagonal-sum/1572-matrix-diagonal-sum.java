class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0;
       int sum1=0;
       int t=mat.length;
       if(t%2==0)
       {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || i+j==t-1) sum+=mat[i][j];
            }
        }
        return sum;
       }
       else
       {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j &&  i+j==t-1) sum1+=mat[i][j];
                else if(i==j) sum1+=mat[i][j];
                else if(i+j==t-1) sum1+=mat[i][j];
            }
        }
        return sum1;
       }
    }
}