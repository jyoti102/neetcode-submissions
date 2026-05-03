class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;

        for (int num: nums) {
            l = Math.max(l, num);
            r += num;
        }

        int res = r;
        while (l <= r) {
            int m = (l + r) / 2;

            if (canSplit(nums, k, m)) {
                res = Math.min(res,m);
                r = m - 1;
            } else l = m + 1;
        }
        return res;
    }

    private boolean canSplit(int[] nums, int k, int max) {
        int subArr = 1;
        int cur = 0;
        for (int num: nums) {
            cur += num;
            if (cur > max) {
                subArr++;
                if (subArr > k) return false;
                cur = num;
            }
        }
        return true;
    }
}