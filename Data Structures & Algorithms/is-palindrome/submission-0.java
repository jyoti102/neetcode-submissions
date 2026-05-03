class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();

        while(i<j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (a == b) {
                i++;
                j--;
            } else if (!((a >= '0' && a <= '9') || 
                        (a >= 'a' && a <= 'z'))) {
                            i++;
            } else if (!((b >= '0' && b <= '9') || 
                        (b >= 'a' && b <= 'z'))) {
                            j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
