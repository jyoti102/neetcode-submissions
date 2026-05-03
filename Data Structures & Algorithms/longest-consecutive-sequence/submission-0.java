class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int length = 0;

        for (int num : numSet) {
            if (!numSet.contains(num-1)) {
                int i = 1;
                while(numSet.contains(num+i)) {
                    i++;
                }
                length = Math.max(length, i);
            }
        }

        return length;
    }
}
