class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
            
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if (nums.length < k + 1) {
                    return true;
                }

                int value = map.get(nums[i]);
                if (value >= i-k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}