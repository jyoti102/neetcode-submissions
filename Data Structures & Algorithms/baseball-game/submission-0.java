class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        for(int i = 0; i < operations.length; i++) {
            String s = operations[i];
            switch(s) {
                case "C" :
                    stack.pop();
                    break;
                case "D" :
                    int last = stack.pop();
                    stack.push(last);
                    stack.push(last*2);
                    break;
                case "+" :
                    int fLast = stack.pop();
                    int sLast = stack.pop();
                    stack.push(sLast);
                    stack.push(fLast);
                    stack.push(fLast + sLast);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }

        }
        for (int val: stack) {
            total = total + val;
        }
        return total;
    }
}