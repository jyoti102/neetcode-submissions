class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Boyer-Moore
        int count1 = 0, count2 = 0;
        Integer c1 = null, c2 = null;

        // Find candidates
        for (int num: nums) {
            if (c1 != null && c1 == num) {
                count1++;
            } else if (c2 != null && c2 == num) {
                count2++;
            } else if (count1 == 0) {
                c1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                c2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        // verify candidates
        for (int num: nums) {
            if (num == c1)
                count1++;
            else if (num == c2)
                count2++;
        }

        List<Integer> res = new ArrayList<>();
        if (count1 > nums.length/3) res.add(c1);
        if (count2 > nums.length/3) res.add(c2);

        return res;
    }
}