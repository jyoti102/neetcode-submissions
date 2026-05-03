class Solution {
    int res = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(0,nums, new ArrayList<>());
        return res;
    }

    private void backtrack(int i, int[] nums, List<Integer> current) {
        int xorr = 0;

        for (int num: current){
            xorr ^= num;
        }
            
        res += xorr;

        for (int j = i; j <nums.length; j++) {
            current.add(nums[j]);
            backtrack(j+1, nums, current);
            current.remove(current.size()-1);
        }
    }
}