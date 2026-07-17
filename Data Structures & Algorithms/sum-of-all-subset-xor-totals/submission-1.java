class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int i, int tot) {
        if (nums.length == i) return tot;
        return dfs(nums, i + 1, tot^nums[i]) + dfs(nums, i + 1, tot);
    }
}