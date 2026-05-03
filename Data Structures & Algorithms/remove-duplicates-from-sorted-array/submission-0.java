class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (!res.contains(nums[i])) {
                res.add(nums[i]);
            }
        }

        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }
        return res.size();
    }
}