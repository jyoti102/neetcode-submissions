class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n + 1];
        dp[n - 1] = 1;

        for (int r = m - 1; r >= 0; r--) {
            for (int l = n - 1; l >= 0; l--) {
                if (obstacleGrid[r][l] != 1) {
                    dp[l] += dp[l + 1];
                } else dp[l] = 0;
            }
        }
        return dp[0];
    }
}