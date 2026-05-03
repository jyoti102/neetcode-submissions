class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int n: nums) {
            total += n;
        }
        int left = 0;

        if (total - nums[0] == 0) return 0;
        total -= nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (left + nums[i-1] == total - nums[i]) {
                return i;
            } else {
                left += nums[i-1];
                total -= nums[i];
            }
        }
        return -1;
    }
}