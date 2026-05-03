class Solution {
    public String removeDuplicates(String s, int k) {
        while (s.length() != 0) {
            boolean flag = false;
            char cur = s.charAt(0);

            int cnt = 1;
            for (int i = 1; i < s.length(); i++) {
                if (cur != s.charAt(i)) {
                    cnt = 0;
                    cur = s.charAt(i);
                }
                cnt++;
                if (cnt == k) {
                    s = s.substring(0, i - cnt + 1) + s.substring(i + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        return s;
    }
}