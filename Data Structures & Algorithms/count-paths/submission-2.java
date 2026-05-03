class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 0; i < m - 1; i++) {
            int[] row = new int[n];
            Arrays.fill(row, 1);
            for (int j = n-2; j >=0; j--) {
                row[j] = row[j + 1] + dp[j];
            }
            dp = row;
        }
        return dp[0];
    }
}
