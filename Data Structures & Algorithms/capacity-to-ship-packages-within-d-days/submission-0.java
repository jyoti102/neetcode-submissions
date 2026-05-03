class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w; 
        }

        int res = r;

        while (l <= r) {
            int cap = (l + r) / 2;
            if (checkShipCount(weights, days, cap)) {
                res = Math.min(res, cap);
                r = cap - 1;
            } else {
                l = cap + 1;
            }
        }
        return res;
    }

    boolean checkShipCount(int[] weights, int days, int cap) {
        int ships = 1; 
        int curCap = cap;

        for (int w: weights) {
            if (curCap - w < 0) {
                ships++;
                if (ships > days) {
                    return false;
                }
                curCap = cap;
            }
            curCap -= w;
        }
        return true;
    }
}