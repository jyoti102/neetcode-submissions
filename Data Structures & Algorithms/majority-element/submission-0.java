class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        if (length == 1) {
            return nums[0];
        }
        for(int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) < length/2) {
                    int val = map.get(nums[i]);
                    map.put(nums[i], val+1);
                } else return nums[i];
            } else {
                map.put(nums[i], 1);
            }

        }
        return 0;
    }
}