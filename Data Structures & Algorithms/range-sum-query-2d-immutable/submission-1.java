class NumMatrix {
    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        sumMatrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            this.sumMatrix[i][0] = matrix[i][0];
            for (int j = 1; j < c; j++) {
                this.sumMatrix[i][j] = matrix[i][j] + sumMatrix[i][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            if (col1 > 0) {
                sum += sumMatrix[i][col2] - sumMatrix[i][col1-1];
            } else
                sum += sumMatrix[i][col2];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */