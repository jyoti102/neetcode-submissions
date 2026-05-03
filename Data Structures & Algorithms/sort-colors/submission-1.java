class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int i = 0;
        while (i < nums.length) {
            int c1 = map.getOrDefault(0, 0);
            while (c1 > 0) {
                nums[i] = 0;
                i++;
                c1--;
            }

            int c2 = map.getOrDefault(1, 0);
            while (c2 > 0) {
                nums[i] = 1;
                i++;
                c2--;
            }

            int c3 = map.getOrDefault(2, 0);
            while (c3 > 0) {
                nums[i] = 2;
                i++;
                c3--;
            }
        }
    }
}