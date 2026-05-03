class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int bot = r-1;
        int row = 0;
        if (r==1 && c==1) {
            return (matrix[0][0]==target);
        }

        while (top <= bot) {
            row = top + (bot - top)/2;
            if (matrix[row][0] <= target && matrix[row][c-1] >= target) {
                break;
            } else if (matrix[row][c-1] > target) {
                bot = row -1;
            } else 
                top = row +1;
        }

        int start = 0;
        int end = c-1;
        int mid = 0;

        while (start < end) {
            mid = ((end - start)/2) + start ;

            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid;
            } else if (matrix[row][mid] == target)
                return true;
        }

        if(matrix[row][mid]==target || matrix[row][start]==target) 
            return true;
        return false;
    }
}
