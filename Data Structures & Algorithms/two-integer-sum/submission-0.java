class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> viewed = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (viewed.containsKey(required)) {
                int[] result = new int[2];
                result[0] = viewed.get(required);
                result[1] = i;
                return result;
            } else {
                viewed.put(nums[i],i);
            }
        }
        return null;
    }
}
