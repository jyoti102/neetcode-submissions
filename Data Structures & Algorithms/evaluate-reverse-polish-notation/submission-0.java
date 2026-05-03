class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String current = tokens[i];
            if (current.equals("+") || current.equals("-") || current.equals("*") || current.equals("/")) {
                if (!stack.isEmpty() && stack.size() > 1) {
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    int result = evaluate(val1, val2, current);
                    stack.push(result);
                }
            } else {
                stack.push(Integer.valueOf(current));
            }
        }
        return stack.pop();
    }


    int evaluate(int val1, int val2, String current) {
        if (current.equals("+")) {
            return val2 + val1;
        }

        if (current.equals("-")) {
            return val2 - val1;
        }

        if (current.equals("*")) {
            return val2 * val1;
        }

        if (current.equals("/")) {
            return val2 / val1;
        }
        return 0;
    }
}
