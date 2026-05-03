class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n] ;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int val = temperatures[i];
            
            while (!stack.isEmpty()) {
                int[] peek = stack.peek();
                if (peek[0] < val) {
                    stack.pop();
                    res[peek[1]] = i - peek[1];
                } else {
                    break;
                }
            }

            if ( i < n - 1 && val < temperatures[i+1]) {
                res[i] = 1;
            } else {
                stack.push(new int[]{val, i});
            }
        }

        return res;
    }
}