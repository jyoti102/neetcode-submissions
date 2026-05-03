class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length-1;
        int mid = (end-0)/2;
        
        return findIndex(nums, target, 0, end, mid);
    }

    int findIndex(int[] nums, int target, int start, int end, int mid) {
        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target) {
            return end;
        }

        if ((end - start) <= 1) {
            return -1;
        }
        
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            start = mid + 1;
            mid = 1 + mid + ((end - start)/2);
            return findIndex(nums, target, start, end, mid);
        }

        if (nums[mid] > target) {
            end = mid;
            mid = (end - start)/2;
            return findIndex(nums, target, start, end, mid);
        }
        return -1;
    }
}
