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
            if (stack.isEmpty()) {
                stack.push(timeReq);
            } else {
                if (stack.peek()<timeReq) {
                    stack.push(timeReq);
                }
            }
        }
        return stack.size();
    }
}
