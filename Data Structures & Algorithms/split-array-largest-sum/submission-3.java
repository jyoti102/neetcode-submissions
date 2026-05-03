class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;

        for(int val: nums) {
            l = Math.max(l, val);
            r += val;
        }
        int res = 0;
        while(l <= r) {
            int m = (l+r)/2;
            if (canSplit(nums, k, m)) {
                res = m;
                r = m - 1;
            } else l = m + 1;
        }
        return res;
    }

    private boolean canSplit(int[] nums, int k, int lgst) {
        int subArr = 1; 
        int cur = 0;

        for (int num: nums) {
            cur += num;
            if (cur > lgst) {
                subArr++;
                if (subArr > k) return false;
                cur = num;
            }
        }
        return true;
    }
}