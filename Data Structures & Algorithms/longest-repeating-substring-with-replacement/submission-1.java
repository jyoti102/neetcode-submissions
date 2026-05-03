class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        int highFreq = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
             
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            highFreq = Math.max(highFreq, map.get(s.charAt(i)));

            while ((i - j + 1) - highFreq > k) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }
            res = Math.max(res, i - j + 1);
        }

        return res;
    }
}
