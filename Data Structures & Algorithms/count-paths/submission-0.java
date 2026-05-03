class Solution {
    int[][] res;
    public int uniquePaths(int m, int n) {
        res = new int[m][n];
        for (int[] ar: res) {
            Arrays.fill(ar, -1);
        }
        return dfs(m,n,0,0);
    }

    private int dfs(int m, int n, int r, int c) {
        if (r == m - 1 && c == n - 1) return 1;

        if (r >= m || c >= n) return 0;

        if (res[r][c] != -1) return res[r][c];

        return res[r][c] = dfs(m,n,r+1,c) + dfs(m,n,r,c+1);
    }
}
