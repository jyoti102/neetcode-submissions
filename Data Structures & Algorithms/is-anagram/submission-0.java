class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()) {
            int[] charAr = new int[127];
            for(int r: s.chars().toArray()) {
                charAr[r] = charAr[r] +1;
            }

            for (int r: t.chars().toArray()) {
                charAr[r] = charAr[r] -1;
            }

            for (int i = 0; i < charAr.length; i++) {
                if (charAr[i] !=0 )
                    return false;
            }
            return true;
        } else return false;
    }
}
