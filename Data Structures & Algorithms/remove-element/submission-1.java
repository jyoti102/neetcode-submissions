class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
                res++;
            } else {
                i++;
            }
        }
        return nums.length - res;
    }
}
