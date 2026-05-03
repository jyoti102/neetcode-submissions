class Solution {
    public String simplifyPath(String path) {
        path = removeExtSlash(path);
        Stack<String> stack = new Stack<>();

        String[] strArr = path.split("/");
        for (String str: strArr) {
            if (stack.isEmpty() && !str.equals("..") && !str.equals(".")) {
                stack.push(str);
            } else {
                if (str.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if(!str.equals("."))
                    stack.push(str);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        return removeExtSlash(res);
    }

    String removeExtSlash(String path) {
        while (path.contains("//") && path.length() > 1) {
            path = path.replace("//", "/");
        }

        if (path.length() > 2 && path.endsWith("/")) {
            path = path.substring(0, path.length() -1);
        }

        if (path.isEmpty()) {
            path = "/";
        }
        return path;
    }
}