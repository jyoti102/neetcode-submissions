class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()) {
                if (temperatures[i] > stack.peek()[0]) {
                    int[] peek = stack.pop();
                    res[peek[1]] = i - peek[1];
                } else break;
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
