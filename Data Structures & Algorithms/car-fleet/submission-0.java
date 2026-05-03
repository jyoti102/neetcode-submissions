class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] ps = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            ps[i][0] = position[i];
            ps[i][1] = speed[i];
        }

        Arrays.sort(ps, (a,b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        
        for (int[] p: ps) {
            double timeReq = (double) (target - p[0]) / p[1];
            stack.push(timeReq);

            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
