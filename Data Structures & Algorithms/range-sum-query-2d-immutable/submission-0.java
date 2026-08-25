class NumMatrix {
     public int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        prefix=new int[row][col];
        for(int i=0;i<row;i++){
            prefix[i][0]=matrix[i][0];
            for(int j=1;j<col;j++){
                prefix[i][j]=prefix[i][j-1]+matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res=0;
        for(int i=row1;i<=row2;i++){
            if(col1>0){
                res+=prefix[i][col2]-prefix[i][col1-1];
            }
            else res+=prefix[i][col2];
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */