class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1ChAr = s1.toCharArray();
        Arrays.sort(s1ChAr);
        String s1Sorted = new String(s1ChAr);

        for(int i = 0; i <= (s2.length()-s1.length()); i++) {
            char[] subStrArr = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(subStrArr);
            String s2SubSortedStr = new String(subStrArr);

            if (s2SubSortedStr.equals(s1Sorted)) {
                return true;
            }
        }
        return false;
    }
}
