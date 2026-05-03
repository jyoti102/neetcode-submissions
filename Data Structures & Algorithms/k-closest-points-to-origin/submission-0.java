class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int i = 0; i < points.length; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.offer(new int[]{dist, points[i][0], points[i][1]});
        }

        for(int i=0; i < k; i++) {
            int[] poll = pq.poll();
            result[i] = new int[]{poll[1], poll[2]};
        }
        return result;

    }
}
