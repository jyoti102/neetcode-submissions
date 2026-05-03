class Solution {
    private int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;

        dp = new int[m][n];
        for (int[] it: dp) {
            Arrays.fill(it, -1);
        }

        return dfs(m,n,0,0, obstacleGrid);
    }

    private int dfs(int m, int n, int i, int j, int[][] grid) {
        if (i == m || j == n || grid[i][j] == 1) return 0;
        if (i == m - 1 && j == n - 1) return 1;

        if (dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = dfs(m, n, i + 1, j, grid) + dfs(m, n, i, j + 1, grid);
    }
}