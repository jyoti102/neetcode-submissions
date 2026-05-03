class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length-1;
        
        return findIndex(nums, target, 0, end);
    }

    int findIndex(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) return mid;
        
        if (nums[mid] > target)
            return findIndex(nums, target, start, mid - 1);
        else
            return findIndex(nums, target, mid + 1, end);
    }
}
