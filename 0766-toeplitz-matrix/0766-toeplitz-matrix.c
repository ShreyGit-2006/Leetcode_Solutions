bool isToeplitzMatrix(int** matrix, int matrixSize, int* matrixColSize) {
    int col=matrixColSize[0];
    for(int i=1;i<matrixSize;i++)
    {
        for(int j=1;j<col;j++)
        {
            if(matrix[i][j]!=matrix[i-1][j-1]) return false;
        }
    }
    return true;
}