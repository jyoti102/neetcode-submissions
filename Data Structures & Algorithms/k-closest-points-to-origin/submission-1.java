class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for (int i = 0; i < n; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.offer(new int[]{dist, points[i][0], points[i][1]});
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] val = pq.poll();
            res[i] = new int[]{val[1], val[2]};
        }

        return res;
    }
}
