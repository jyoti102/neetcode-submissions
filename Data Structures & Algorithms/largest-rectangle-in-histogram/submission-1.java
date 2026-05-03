class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<int[]> stack = new Stack<>();
        int maxAr = 0;

        for (int i = 0; i < n; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int idx = top[0];
                int h = top[1];
                maxAr = Math.max(maxAr, h * (i - idx));
                start = idx;
            }

            stack.push(new int[]{start, heights[i]});
        }

        for (int[] pair:stack) {
            int idx = pair[0];
            int h = pair[1];
            maxAr = Math.max(maxAr, h * (n - idx));
        }
        return maxAr;
    }
}