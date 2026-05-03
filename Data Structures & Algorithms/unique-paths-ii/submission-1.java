class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[m + 1][n + 1];
        dp[m - 1][n - 1] = 1;

        for (int r = m - 1; r >= 0; r--) {
            for (int l = n - 1; l >= 0; l--) {
                if (obstacleGrid[r][l] != 1) {
                    dp[r][l] += dp[r+1][l] + dp[r][l+1];
                }
            }
        }

        return dp[0][0];
    }
}