class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) return cost[cost.length - 1];
        int p1 = cost[0];
        int p2 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int temp = cost[i] + Math.min(p1, p2);
            p1 = p2;
            p2 = temp;
        }
        return Math.min(p1,p2);
    }
}
