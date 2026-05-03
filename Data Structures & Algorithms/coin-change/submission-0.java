class Solution {
    Map<Integer, Integer> map;
    public int coinChange(int[] coins, int amount) {
        map = new HashMap<>();
        int min = dfs(amount, coins);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private int dfs(int amt, int[] coins) {
        if (amt == 0) return 0;
        if (map.containsKey(amt)) return map.get(amt);

        int res = Integer.MAX_VALUE;

        for (int coin :coins) {
            if (amt - coin >= 0) {
                int result = dfs(amt - coin, coins);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }

        map.put(amt,res);
        return res;
    }
}
