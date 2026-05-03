class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subStr = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String c = ""+s.charAt(i);
            int index = subStr.indexOf(c);
            if (index > -1) {
                subStr = subStr.substring(index+1, subStr.length());
            }
            subStr = subStr+c;
            max = Math.max(subStr.length(), max);
        }
        return max;
    }
}
