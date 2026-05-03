class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        int sum = 0;
        int r = 0;
        
        for (int l = 0; l < nums.length; l++) {
            if (l > 0) {
                sum = sum - nums[l-1];
            }

            while (r < nums.length && sum < target) {
                sum = sum + nums[r];
                r++;
            }

            if (target <= sum) {
                if (result == 0) {
                    result = r - l;
                }
                result = Math.min(result, r - l);
            }
        }
        

        return result;
    }
}