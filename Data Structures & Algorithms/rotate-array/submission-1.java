class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            int cur = start;
            int prev = nums[start];

            do {
                int nextIdx = (cur + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev;
                prev = temp;
                cur = nextIdx;
                count++;
            } while (start != cur);
        }
    }
}