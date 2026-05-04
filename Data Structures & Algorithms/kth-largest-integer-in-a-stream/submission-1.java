class KthLargest {
    PriorityQueue<Integer> pq;
    int l;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        l = k;
        for (int n: nums) {
            add(n);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if (pq.size() > l) {
            pq.poll();
        }
        return pq.peek();
    }
}
