class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);

        for (int num: nums) {
            pq.offer(num);
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }
        return (pq.size() > 0) ? pq.poll() : 0;
    }
}
