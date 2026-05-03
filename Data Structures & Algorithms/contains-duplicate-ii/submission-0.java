class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1; i++) {
            int loop2 = (i + k < nums.length) ? i + k : nums.length - 1;
            
            for (int j = i+1; j <= loop2; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}