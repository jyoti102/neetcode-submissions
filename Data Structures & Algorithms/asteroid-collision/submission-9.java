public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = -1;

        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            
            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                boolean addVal = false;
                while (!stack.isEmpty()) {
                    int peek = stack.peek();

                    if (peek < 0) {
                        addVal = true;
                        break;
                    }

                    if (peek > 0 && a > 0) {
                        addVal = false;
                        stack.push(a);
                        break;
                    }

                    if (peek - Math.abs(a) == 0) {
                        stack.pop();
                        addVal = false;
                        break;
                    }

                    if (Math.abs(peek) < Math.abs(a)) {
                        stack.pop();
                        addVal = true;
                    }

                    if (Math.abs(peek) > Math.abs(a)) {
                        addVal = false;
                        break;
                    }
                }

                if (addVal) {
                    stack.push(a);
                }
            }
        }

        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}