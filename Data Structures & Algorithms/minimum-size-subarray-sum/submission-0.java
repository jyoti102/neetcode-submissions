class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = 0;

            while (sum < target && (i + j) < nums.length) {
                sum = sum + nums[i + j];
                j++;
            }

            if (sum >= target) {
                if (result == 0) {
                    result = j;
                }
                result = Math.min(result, j);
            }
        }
        return result;
    }
}