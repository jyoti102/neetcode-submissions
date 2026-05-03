class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.startsWith("]") || s.startsWith("}") || s.startsWith(")")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty()) {
                char top = (char) stack.peek();
                if ((current == ')' && top == '(') 
                        || (current == '}' && top == '{') 
                        || (current == ']' && top == '[')) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
            } else 
                stack.push(current);
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
