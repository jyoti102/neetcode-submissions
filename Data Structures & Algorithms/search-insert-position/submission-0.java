class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (end - start <= 0) return (nums[end] < target) ? end + 1 : start;

        int mid = (start + end)/2;
        
        if (nums[mid] == target) return mid;

        return (nums[mid] < target) ? binarySearch(nums, target, mid+1, end):binarySearch(nums, target, start, mid);

    }
}