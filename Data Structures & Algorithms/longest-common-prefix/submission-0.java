class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ss = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (ss.length() > 0) {
                ss = checkCommonSubString(ss, strs[i]);
            } else break;
        }
        return ss;
    }

    String checkCommonSubString(String ss, String str) {
        if (ss.length() > 0) {
            if (str.contains(ss)) {
                return ss;
            } else {
                ss = ss.substring(0,ss.length()-1);
                return checkCommonSubString(ss, str);
            }
        } else {
            return ss;
        }
    }    
}